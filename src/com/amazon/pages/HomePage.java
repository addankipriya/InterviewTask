package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement shopby() {
	WebElement we =  driver.findElement(By.xpath("//span[text() =  'Shop by']"));
	return we;
	
	}
	public WebElement shopByItem_womensfashion() {
		WebElement we = driver.findElement(By.xpath("//span[text()=\"Women's Fashion\"]"));
		return we;
	}
	public WebElement womansAccenssories_watches(){
		WebElement we = driver.findElement(By.xpath("//a[contains(@href,'Women-Watches')]//span[text()='Watches']"));
		return we;
	}
	public void clickwomansAccenssories_watches() {
		womansAccenssories_watches().click();
	}

}
