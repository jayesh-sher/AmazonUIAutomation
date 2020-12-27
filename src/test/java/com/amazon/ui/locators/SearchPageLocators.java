package com.amazon.ui.locators;

import org.openqa.selenium.By;

public class SearchPageLocators {

	private static final By SEARCH_ITEM_LOCATOR = By
			.xpath("//a/span[contains (text(),'Apple iPhone 12') and @xpath='1']");
	private static final By STOCK_CHECK_LOCATOR = By.xpath("//span[contains(text(),'In stock.')]");
	private static final By ADD_TO_CART_BUTTON_LOCATOR = By.xpath("//input[@id='add-to-cart-button']");
	private static final By CART_NUMBER_LOCATOR = By.xpath("//a[@id='nav-cart']/div/span[@id='nav-cart-count']");
	private static final By ADDED_TO_CART_CONFIRMATION_LOCATOR = By.xpath("//div[@id='attach-added-to-cart-message']");

	public static By getSearchItemLocator() {
		return SEARCH_ITEM_LOCATOR;
	}

	public static By getStockCheckLocator() {
		return STOCK_CHECK_LOCATOR;
	}

	public static By getAddToCartButtonLocator() {
		return ADD_TO_CART_BUTTON_LOCATOR;
	}

	public static By getCartNumberLocator() {
		return CART_NUMBER_LOCATOR;
	}

	public static By getAddedToCartConfirmationLocator() {
		return ADDED_TO_CART_CONFIRMATION_LOCATOR;
	}

}
