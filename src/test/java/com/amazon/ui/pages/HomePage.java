package com.amazon.ui.pages;

import org.junit.Assert;
import org.openqa.selenium.TimeoutException;

import com.amazon.ui.locators.HomePageLocators;
import com.amazon.ui.setup.SetUp;

public class HomePage {

	public static boolean isHomePageOpen() {
		try {
			return SetUp.isElementDisplayed(HomePageLocators.getAmazonLogoLocator());
		} catch (TimeoutException e) {
			return false;
		}
	}

	public static void openHomePage() {
		SetUp.driver.get(SetUp.config.getProperty("url"));
	}

	public static void enterSearchItem(String item) {
		SetUp.setTextinField(HomePageLocators.getSearchTextfieldLocator(), item);
	}

	public static void submitSearch() {
		SetUp.clickButton(HomePageLocators.getSearchButtonLocator());
	}

	public static void verifyLoginUser(String user) {
		if (user == null) {
			Assert.assertTrue("Some user Signed In",
					SetUp.doesFieldContain(HomePageLocators.getUsernameLocator(), "Sign in"));
		} else {
			Assert.assertFalse("No user Signed In",
					SetUp.doesFieldContain(HomePageLocators.getUsernameLocator(), "Sign in"));
			Assert.assertTrue("Some other user Signed In",
					SetUp.doesFieldContain(HomePageLocators.getUsernameLocator(), user));
		}
	}

	public static void goToLoginPage() {
		SetUp.mouseOver(HomePageLocators.getUsernameComboLocator());
		SetUp.clickButton(HomePageLocators.getSignInButtonLocator());
	}

	public static void signOut() {
		openHomePage();
		if (!SetUp.doesFieldContain(HomePageLocators.getUsernameLocator(), "Sign in")) {
			SetUp.mouseOver(HomePageLocators.getUsernameComboLocator());
			SetUp.clickButton(HomePageLocators.getSignOutLocator());
			openHomePage();
		}
		Assert.assertTrue("Sign Out failed", SetUp.doesFieldContain(HomePageLocators.getUsernameLocator(), "Sign in"));
	}

}
