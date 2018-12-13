package com.amazon.functions;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.pages.HomePage;

public class ShopByItem {
	public static void shopByItem_WomenAccessories(WebDriver driver) throws FileNotFoundException, IOException {
		HomePage homepage = new HomePage(driver);
		WebDriverWait wait = new WebDriverWait (driver, 15);
		Actions action = new Actions(driver);
		action.moveToElement(homepage.shopby()).build().perform();
		action.moveToElement(homepage.shopByItem_womensfashion()).build().perform();
		wait.until(ExpectedConditions.visibilityOf(homepage.womansAccenssories_watches()));
		homepage.womansAccenssories_watches();
		homepage.clickwomansAccenssories_watches();
}
}
