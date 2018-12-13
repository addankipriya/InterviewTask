package com.dropbox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement signinIcon(){
		return driver.findElement(By.xpath("//a[text()='Sign in']"));
	}
	public void clicksigninIcon() {
		signinIcon().click();
	}
	public WebElement loginMailid(){
		return driver.findElement(By.xpath("//input[@name ='login_email']"));
	}
	public void enterloginMailid(String value) {
		loginMailid().sendKeys(value);
	}
	public WebElement loginPassword(){
		return driver.findElement(By.xpath("//input[@name ='login_password']"));
	}
	public void enterloginPassword(String value) {
		loginPassword().sendKeys(value);
	}
	public WebElement sigin() {
		return driver.findElement(By.xpath("//button/div[text()='Sign in']"));
	}
	public void clickSignin() {
		sigin().click();
	}
	public By uploadIcon() {
		//return driver.findElement(By.xpath("//span[text()='Upload']"));
		return By.xpath("//span[text()='Upload']");
	}
	public void clickUploadIcon() {
		//uploadIcon().click();
		driver.findElement(uploadIcon()).click();
	}
	public WebElement uploadFiles() {
		return driver.findElement(By.xpath("//button[text()='Files']"));
	}
	public void clickUploadFiles() {
		uploadFiles().click();
	}
	
	public By uploadToTreeDropbox() {
		return By.xpath("//span[contains(@class,'tree-view') and contains(text(),'Dropbox')]");
	}
	
	public void clickUploadToTreeDropbox() {
		driver.findElement(uploadToTreeDropbox()).click();
	}
	
	public WebElement uploadToUploadButton() {
		return driver.findElement(By.xpath("//span[contains(@class,'mc-button-content') and contains(text(),'Upload')]"));
	}
	
	public void clickUploadToUploadButton() {
		uploadToUploadButton().click();
	}
	
	public By linkFileUploaded(String fileName) {
		return By.xpath("//a[contains(text(),'"+fileName+"')]");
	}
}
