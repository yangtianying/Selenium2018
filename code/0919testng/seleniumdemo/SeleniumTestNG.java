package com.edu.seleniumdemo;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTestNG {
	WebDriver driver=null;
	@BeforeClass
	public void initBrowser(){
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		 driver = new FirefoxDriver();
	}
	public void login(String usernam,String password) {
		
	}
	
	@Test(timeOut=10000,description="测试后台正确登录")
	public void AdminLoginSuccess() throws InterruptedException {
		driver.get("http://localhost:8032/mymovie/admin.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		boolean flag=driver.findElement(By.linkText("退出")).isEnabled();
		assertTrue(flag);
//		driver.getPageSource().contains("退出")
		
		
	}
		@Test 
	public void AdminLoginFail() {
			
		
	}
	
	

}
