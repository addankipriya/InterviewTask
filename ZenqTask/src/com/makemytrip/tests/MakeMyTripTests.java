package com.makemytrip.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.makemytrip.functions.Browser;
import com.makemytrip.functions.SignUp;

public class MakeMyTripTests {

	@Test
	public void signupTest() throws IOException {
		
		Browser browser = new Browser();
		try {
			WebDriver driver = browser.initializeDriver("https://www.makemytrip.com");		
			SignUp.signUpMakeMyTrip(driver);
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}finally {
			browser.quit();
		}
	}

	
}
