package com.amazon.ui.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

	private static final By LOGIN_TEXT_LOCATOR = By.xpath("//h1[contains(text(),'Login')]");
	private static final By USERNAME_TEXTFIELD_LOCATOR = By.xpath("//input[@id='ap_email']");
	private static final By CONTINUE_BUTTON = By.xpath("//input[@id='continue']");
	private static final By PASSWORD_TEXT_LOCATOR = By.xpath("//label[contains(text(),'Password')]");
	private static final By PASSWORD_TEXTFIELD_LOCATOR = By.xpath("//input[@id='ap_password']");
	private static final By LOGIN_SUBMIT_LOCATOR = By.xpath("//input[@id='signInSubmit']");
	private static final By INVALID_USERNAME_LOCATOR = By
			.xpath("//span[contains(text(),'We cannot find an account with that email address')]");
	private static final By INVALID_PASSWORD_LOCATOR = By
			.xpath("//span[contains(text(),'Your password is incorrect')]");

	public static By getLoginTextLocator() {
		return LOGIN_TEXT_LOCATOR;
	}

	public static By getUsernameTextfieldLocator() {
		return USERNAME_TEXTFIELD_LOCATOR;
	}

	public static By getContinueButton() {
		return CONTINUE_BUTTON;
	}

	public static By getPasswordTextLocator() {
		return PASSWORD_TEXT_LOCATOR;
	}

	public static By getPasswordTextfieldLocator() {
		return PASSWORD_TEXTFIELD_LOCATOR;
	}

	public static By getLoginSubmitLocator() {
		return LOGIN_SUBMIT_LOCATOR;
	}

	public static By getInvalidUsernameLocator() {
		return INVALID_USERNAME_LOCATOR;
	}

	public static By getInvalidPasswordLocator() {
		return INVALID_PASSWORD_LOCATOR;
	}

}
