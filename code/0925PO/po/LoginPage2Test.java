package com.edu.po;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage2Test {
	LoginPage2 lp =null;
	@BeforeClass
	public void initLoginPage2() {
		 lp =new LoginPage2();
	}
	@AfterClass
	public void tearDownLoginPage2() {
		lp.quitBrowser();
	}
	@Test
	public void testLoginSuccess() throws InterruptedException {
		lp.openUrl();
		lp.login("admin", "admin");
		assertTrue(lp.getDriver().getPageSource().contains("ÕÀ≥ˆ"));
	}
	
	@Test
	public void testLoginFail() throws InterruptedException {
		lp.openUrl();
		lp.login("admin", "123456");
		assertTrue(lp.getDriver().getPageSource().contains("’ ∫≈ªÚ√‹¬Î¥ÌŒÛ"));
	}
}
