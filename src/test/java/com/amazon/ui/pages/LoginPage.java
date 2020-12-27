package com.amazon.ui.pages;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

import com.amazon.ui.locators.LoginPageLocators;
import com.amazon.ui.setup.SetUp;

public class LoginPage {

	public static boolean isLoginPageOpen() {
		try {
			return SetUp.isElementDisplayed(LoginPageLocators.getLoginTextLocator());
		} catch (TimeoutException e) {
			return false;
		}
	}

	public static void openLoginPage() {
		HomePage.openHomePage();
		HomePage.goToLoginPage();
		Assert.assertTrue(isLoginPageOpen());
	}

	public static void enterUsername(String email) {
		SetUp.setTextinField(LoginPageLocators.getUsernameTextfieldLocator(), email);
	}

	public static void submitUsername() {
		SetUp.clickButton(LoginPageLocators.getContinueButton());
	}

	public static void enterPassword(String password) {
		SetUp.setTextinField(LoginPageLocators.getPasswordTextfieldLocator(), password);
	}

	public static void submitPassword() {
		SetUp.clickButton(LoginPageLocators.getLoginSubmitLocator());
	}

	public static void validLogin(String user, String email, String password) {
		enterUsername(email);
		submitUsername();
		verifyValidUser();
		enterPassword(email);
		submitPassword();
		HomePage.verifyLoginUser(user);
	}

	public static void verifyValidUser() {
		Assert.assertTrue(SetUp.isElementDisplayed(LoginPageLocators.getPasswordTextLocator()));
	}

	public static void verifyInvalidUser() {
		Assert.assertTrue(SetUp.isElementDisplayed(LoginPageLocators.getInvalidUsernameLocator()));
	}

}
