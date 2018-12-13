package com.amazon.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.functions.ShopByItem;
import com.amazon.pages.WomensWatchesPage;
import com.makemytrip.functions.Browser;

public class AmazonTests {
	@Test
	public void shopByItem() throws IOException {
		
		Browser browser = new Browser();
		try {
			WebDriver driver = browser.initializeDriver("https://www.Amazon.in");
			ShopByItem.shopByItem_WomenAccessories(driver);
			WomensWatchesPage womenswatchespage = new WomensWatchesPage(driver);
			Assert.assertEquals(womenswatchespage.womensWatches_heading().getText(),"WOMEN'S WATCHES");
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail();
		}finally {
			browser.quit();
		}
	}

	
}
