package com.example.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelperBase {
protected final ApplicationManager manager;
	private WebDriver driver;
	public HelperBase(ApplicationManager manager){
		this.manager=manager;
	driver = manager.getWebDriverHelper().getDriver();
	}
	
	 protected boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }
	 protected void type(String locator, String name) {
			driver.findElement(By.name(locator)).clear();
		    driver.findElement(By.name(locator)).sendKeys(name);
		}

	

	protected WebElement findElement(By linkText) {
		return driver.findElement(linkText);
	}

	protected void openUrl(String string) {
		driver.get(string);
	}

	protected void click(By linkText) {
		findElement(linkText).click();
	}



}
