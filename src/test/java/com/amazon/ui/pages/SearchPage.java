package com.amazon.ui.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import com.amazon.ui.locators.SearchPageLocators;
import com.amazon.ui.setup.SetUp;

public class SearchPage {	

	public static void searchItem(String search_text) {
		HomePage.openHomePage();
		HomePage.enterSearchItem(search_text);
		HomePage.submitSearch();
	}

	public static void isItemPresent(String search_text) {
		Assert.assertTrue(SetUp.isElementDisplayed(By.xpath("//a/span[contains (text(),'" + search_text + "')]")));
	}

	public static void openSearchItem(String search_text) {
		Assert.assertTrue(SetUp.clickButton(By.xpath("//a/span[contains (text(),'" + search_text + "')]")));
	}

	public static void addItemToCart(String search_text) {
		openSearchItem(search_text);
		SetUp.driver.switchTo().window(SetUp.driver.getWindowHandles().toArray()[1].toString());
		Assert.assertTrue("Item out of stock", SetUp.isElementDisplayed(SearchPageLocators.getStockCheckLocator()));
		SetUp.clickButton(SearchPageLocators.getAddToCartButtonLocator());		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkItemCount(String count) {
		HomePage.openHomePage();
		Assert.assertTrue("Cart count is wrong", SetUp.getFieldtext(SearchPageLocators.getCartNumberLocator()).equals(count));
	}
	
	

}
