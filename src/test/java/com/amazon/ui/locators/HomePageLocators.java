package com.amazon.ui.locators;

import org.openqa.selenium.By;

public class HomePageLocators {

	private static final By AMAZON_LOGO_LOCATOR = By.xpath("//a[@id='nav-logo-sprites']");
	private static final By USERNAME_COMBO_LOCATOR = By.xpath("//a[@id='nav-link-accountList']");
	private static final By USERNAME_LOCATOR = By.xpath("//a[@id='nav-link-accountList']/div/span");
	private static final By SIGN_IN_BUTTON_LOCATOR = By
			.xpath("//div[@id='nav-flyout-ya-signin']/a/span[contains (text(), 'Sign in')]");
	private static final By SEARCH_TEXTFIELD_LOCATOR = By.xpath("//input[@id='twotabsearchtextbox']");
	private static final By SEARCH_BUTTON_LOCATOR = By.xpath("//span[@id='nav-search-submit-text']");
	private static final By SIGN_OUT_LOCATOR = By.xpath("//span[contains(text(),'Sign Out')]");

	public static By getAmazonLogoLocator() {
		return AMAZON_LOGO_LOCATOR;
	}

	public static By getUsernameComboLocator() {
		return USERNAME_COMBO_LOCATOR;
	}

	public static By getUsernameLocator() {
		return USERNAME_LOCATOR;
	}

	public static By getSignInButtonLocator() {
		return SIGN_IN_BUTTON_LOCATOR;
	}

	public static By getSearchTextfieldLocator() {
		return SEARCH_TEXTFIELD_LOCATOR;
	}

	public static By getSearchButtonLocator() {
		return SEARCH_BUTTON_LOCATOR;
	}

	public static By getSignOutLocator() {
		return SIGN_OUT_LOCATOR;
	}
}
