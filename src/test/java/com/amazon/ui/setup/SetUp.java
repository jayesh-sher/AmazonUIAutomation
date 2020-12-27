package com.amazon.ui.setup;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SetUp extends BaseDriver {

	public static String configPath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
	public static Properties config = BaseDriver.propertiesSet(configPath);
	public static WebDriver driver = BaseDriver.driverSet(config.getProperty("browser", "chrome"));
	private static Actions action = new Actions(driver);

	public static void openWebPage() {
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static boolean clickButton(By btnLoc) {
		WebElement button = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(btnLoc));
		if (button != null) {
			button.click();
			return true;
		} else {
			System.out.println("Button not found");
			return false;
		}
	}

	public static boolean isElementDisplayed(By itemLoc) {
		WebElement element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(itemLoc));
		if (element != null) {
			System.out.println("Element found");
			if (element.isDisplayed()) {
				System.out.println("Element is displayed");
				return true;
			} else {
				System.out.println("Element is not displayed");
				return false;
			}
		} else {
			System.out.println("Element not found");
			return false;
		}
	}

	public static void setTextinField(By fieldLoc, String text) {
		WebElement field = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(fieldLoc));
		if (field != null) {
			field.click();
			field.sendKeys(text);
		} else {
			System.out.println("field not found");
		}
	}

	public static void selectValueinField(By fieldLoc, String text) {
		WebElement field = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(fieldLoc));
		if (field != null) {
			field.click();
			Select field2 = new Select(field);
			field2.selectByValue(text);
		} else {
			System.out.println("field not found");
		}
	}

	public static String getFieldtext(By fieldLoc) {
		WebElement field = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(fieldLoc));
		if (field != null) {
			String text = new String(field.getText());
			return text;
		} else {
			System.out.println("field not found");
			return null;
		}
	}

	public static boolean doesFieldContain(By fieldLoc, String text) {
		String text2 = getFieldtext(fieldLoc);
		if (text2.contains(text)) {
			return true;
		} else {
			System.out.println("string not found");
			return false;
		}
	}

	public static void mouseOver(By fieldLoc) {
		WebElement field = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(fieldLoc));
		action.moveToElement(field).perform();
	}
}
