package com.edu.po;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage3Test {
//	get();在父类中是调用了load()方法
	LoginPage3 lp =null;
	@BeforeClass
	public void initLoginPage3() {
		 lp =new LoginPage3();
	}
	@AfterClass
	public void tearDownLoginPage3() {
		lp.quitBrowser();
	}
	@Test
	public void testLoginSuccess() throws InterruptedException {
		lp.load();
		lp.get();
//		以上两种选择一种即可
		lp.login("admin", "admin");
		assertTrue(lp.getDriver().getPageSource().contains("退出"));
	}
	
	@Test
	public void testLoginFail() throws InterruptedException {
		
		lp.login("admin", "123456");
		assertTrue(lp.getDriver().getPageSource().contains("帐号或密码错误"));
	}

}
