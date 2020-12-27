package com.amazon.ui.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.amazon.ui.setup.SetUp;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/"
		, glue = { "com.amazon.ui.stepdef" }
		, dryRun = false
		, monochrome = true
		, plugin = {"pretty","html:target/Destination/html"}
		)
public class TestRunner {
	
	@BeforeClass
	public static void beforeSuit() {
		SetUp.openWebPage();
	}

	@AfterClass
	public static void afterSuit() {
		SetUp.closeBrowser();
	}
}
