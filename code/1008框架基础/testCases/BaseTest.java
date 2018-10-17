package com.edu.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;



public class BaseTest {

	WebDriver driver =null;
	@BeforeSuite
	public void startBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@AfterSuite
	public void quitBrowser() {
		this.driver.quit();
	}
}
