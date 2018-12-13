package com.dropbox.functions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dropbox.pages.HomePage;



public class DropboxFunctions {
	
public static void loginDropbox(WebDriver driver){
		
		HomePage homePage = new HomePage(driver);
		homePage.clicksigninIcon();
		homePage.enterloginMailid("addanki.priya@gmail.com");
		homePage.enterloginPassword("BlaBla@CantSharePassword");
		homePage.clickSignin();
		new WebDriverWait(driver,120).until(ExpectedConditions.visibilityOfElementLocated(homePage.uploadIcon()));
		
	}

public static void uploadFileToDropbox(WebDriver driver) throws IOException, InterruptedException, AWTException {
	HomePage homePage = new HomePage(driver);
	homePage.clickUploadIcon();		
	File file = new File("FileToUpload.txt");
	file.createNewFile();
	String str = "Sample Text";
    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    writer.write(str);	     
    writer.close();
    homePage.clickUploadFiles();
    Thread.sleep(2000);
	Robot robot = new Robot();
	StringSelection sel = new StringSelection(file.getAbsolutePath());
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(1000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(homePage.uploadToTreeDropbox()));
    homePage.clickUploadToTreeDropbox();
    homePage.clickUploadToUploadButton();
    new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(homePage.linkFileUploaded(file.getName())));
}
}
