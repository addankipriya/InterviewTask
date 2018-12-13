package com.makemytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver driver) {
	this.driver=driver;
}
public WebElement signupicon() {
	return driver.findElement(By.xpath("//a[@id = 'ch_signup_icon']"));
}
public void clickSignupIcon() {
	signupicon().click();
}
public WebElement signupEmail() {
	return driver.findElement(By.xpath("//input[@id = 'ch_signup_email']"));
}
public void enterSignupEmail(String value) {
	signupEmail().sendKeys(value);
}
public WebElement signupPhone() {
	return driver.findElement(By.xpath("//input[@id = 'ch_signup_phone']"));
}
public void enterSignupPhone(String value) {
	signupPhone().sendKeys(value);
}
public WebElement signuppassword(){
	return driver.findElement(By.xpath("//input[@id = 'ch_signup_password']"));
}
public void entersignuppassword(String value) {
	signuppassword().sendKeys(value);
}
public WebElement signUpButton() {
	return driver.findElement(By.xpath("//button[@id = 'ch_signup_btn']"));
}
public void clickSignUpButton() {
	signUpButton().click();
}

}
