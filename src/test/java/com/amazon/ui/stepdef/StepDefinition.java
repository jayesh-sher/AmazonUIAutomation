package com.amazon.ui.stepdef;

import com.amazon.ui.pages.HomePage;
import com.amazon.ui.pages.LoginPage;
import com.amazon.ui.pages.SearchPage;
import com.amazon.ui.setup.SetUp;

import cucumber.api.java.en.*;

public class StepDefinition {

	@Given("Amazon website is open")
	public void amazon_website_is_open() {
		if (!HomePage.isHomePageOpen()) {
			SetUp.openWebPage();
		}
	}

	@When("User enters invalid username and submits")
	public void user_enters_invalid_username_and_submits() {
		HomePage.goToLoginPage();
		LoginPage.isLoginPageOpen();
		LoginPage.enterUsername("invalid_username");
		LoginPage.submitUsername();
	}

	@Then("User should get error message")
	public void user_should_get_error_message() {
		LoginPage.verifyInvalidUser();
	}

	@When("User enters valid username and submits")
	public void user_enters_valid_username_and_submits() {
		HomePage.goToLoginPage();
		LoginPage.isLoginPageOpen();
		LoginPage.enterUsername(SetUp.config.getProperty("email"));
		LoginPage.submitUsername();
		LoginPage.verifyValidUser();
	}

	@When("User enters valid password and submits")
	public void user_enters_valid_password_and_submits() {
		LoginPage.enterPassword(SetUp.config.getProperty("password"));
		LoginPage.submitPassword();		
	}

	@Then("User should be logged in")
	public void user_should_be_logged_in() {
		HomePage.verifyLoginUser(SetUp.config.getProperty("user"));
	}

	@When("User searches for {}")
	public void user_searches_for_item(String search_text) {
		SearchPage.searchItem(search_text);
	}

	@Then("User is shown {} search results")
	public void user_is_shown_search_results(String search_text) {
		SearchPage.isItemPresent(search_text);
	}

	@When("User adds {} to cart")
	public void user_adds_item_to_cart(String search_text) {
		SearchPage.addItemToCart(search_text);
	}

	@Then("{} is added to cart")
	public void item_is_added_to_cart(String search_text) {
		SearchPage.checkItemCount("1");
	}
	@Then("User is signed out")
	public void user_is_signed_out() {
		HomePage.signOut();
	}
	@Then("User cart is empty")
	public void user_cart_is_empty() {
		SearchPage.checkItemCount("0");
	}
}
