package com.makemytrip.functions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import com.makemytrip.pages.HomePage;

public class SignUp {

	public static void signUpMakeMyTrip(WebDriver driver) throws FileNotFoundException, IOException {
		
		HomePage homePage = new HomePage(driver);
		//ExcelUtil excel= new ExcelUtil("MakeMyTripTestData.xlsx");
		String filePath = "MakeMyTripTestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(filePath));
		XSSFSheet ws = wb.getSheet("Sheet1");
		homePage.clickSignupIcon();
		homePage.enterSignupEmail(ws.getRow(1).getCell(0).getStringCellValue());
		homePage.enterSignupPhone(NumberToTextConverter.toText(ws.getRow(1).getCell(1).getNumericCellValue()));
		homePage.entersignuppassword(ws.getRow(1).getCell(2).getStringCellValue());
		homePage.clickSignUpButton();
		wb.close();
	}
}
