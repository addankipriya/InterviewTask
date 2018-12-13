package com.amazon.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	WebDriver driver;
	public WebDriver initializeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}	
	
	public void quit() {
		driver.quit();
	}

}
