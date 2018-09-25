package com.edu.po;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage1Test {
	public WebDriver driver =null;
	LoginPage1 lp  =null;
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://localhost:8032/mymovie/admin.php/");
	
		LoginPage1 lp = new LoginPage1(driver);
	}
	@AfterClass
	public void quitBrowser() {
		this.driver.quit();
	}
	
	@Test
	public void testLoginSuccess() throws InterruptedException {
		lp.username.sendKeys("admin");
		lp.password.sendKeys("admin");
//		lp.password.submit();
		lp.submitBtn.click();
		Thread.sleep(3000);
		assertTrue(driver.getPageSource().contains("ÍË³ö"));
		
	}
	
	@Test
	public void testLoginFail() throws InterruptedException {
		
		lp.username.sendKeys("admin");
		lp.password.sendKeys("admin");
//		lp.password.submit();
		lp.submitBtn.click();
		Thread.sleep(3000);
		assertTrue(driver.getPageSource().contains("ÍË³ö"));
		
	}

}
