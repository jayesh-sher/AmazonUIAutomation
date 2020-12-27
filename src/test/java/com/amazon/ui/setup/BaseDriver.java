package com.amazon.ui.setup;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseDriver {

	public static WebDriver driverSet(String browser) {
		WebDriver driver;
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		System.out.println("Starting Tests : browser is " + browser);
		return driver;
	}

	public static Properties propertiesSet(String configPath) {
		Properties config = new Properties();
		try {
			BufferedReader br = new BufferedReader(new FileReader(configPath));
			config.load(br);
		} catch (IOException e) {
			System.out.println("Config file not found.. Proceeding with default values");
			config.setProperty("browser", "chrome");
			config.setProperty("url", "https://www.amazon.in/");
			config.setProperty("username", "jsmith");
			config.setProperty("password", "Demo1234");
		}
		return config;
	}
}

