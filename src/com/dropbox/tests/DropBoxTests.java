package com.dropbox.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.dropbox.functions.Browser;
import com.dropbox.functions.DropboxFunctions;


public class DropBoxTests {
	
	WebDriver driver;
	Browser browser;
	
	@BeforeClass
	public void setUp() {
		browser = new Browser();
		driver = browser.initializeDriver("https://www.dropbox.com/?landing=dbv2");
	}
	
	@Test(priority=1)
	public void logindropbox() throws IOException {
		
		try {
			DropboxFunctions.loginDropbox(driver);
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
			browser.quit();
		}
	}
	
	@Test(priority=2)
	public void verifyFileUpload() {
		try {
			DropboxFunctions.uploadFileToDropbox(driver);
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}finally {
			browser.quit();
		}
	}
}
