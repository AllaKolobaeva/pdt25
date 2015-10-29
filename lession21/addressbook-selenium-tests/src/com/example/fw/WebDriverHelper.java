package com.example.fw;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ManagedClientConnection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverHelper {
	private static WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();
	private final ApplicationManager manager;
	 
	public WebDriverHelper(ApplicationManager manager){
		 this.manager= manager;
		 driver = new FirefoxDriver();
		  //  baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("http://localhost/addressbookv4.1.4/");
	 }
	 public void stop() {
			
			driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
			// TODO Auto-generated method stub
			
		}
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}


}

