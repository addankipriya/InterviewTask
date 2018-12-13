package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomensWatchesPage {
	WebDriver driver;
	public WomensWatchesPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement womensWatches_heading() {
	WebElement we =  driver.findElement(By.xpath("//h1[text() =  \"WOMEN'S WATCHES\"]"));
	return we;
	
	}
}
