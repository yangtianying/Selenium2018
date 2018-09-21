package com.edu.screenshot;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener2.class)
public class AdminLoginTest extends BaseTest{
	
	@Test
	public void testAdminLoginSuccess() throws InterruptedException {
		driver.get("http://localhost:8032/Mymovie/admin.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getPageSource().contains("ÍË³ö111"));
	}

}
