package com.edu.testCases;

import org.testng.annotations.Test;

import com.edu.appModules.Login_Action;

public class LoginTest extends BaseTest{
	
	@Test
	public void clickLogin() throws Exception {
		Login_Action.execute(driver,"qingdao01","qingdao01");
	}
}
