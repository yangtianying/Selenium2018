package com.edu.test0917;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 李焕贞
 */
public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8032/mymovie/");
		driver.findElement(By.linkText("登录")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("qingdao01");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='马上登录']")).click();
		boolean s1 = driver.getPageSource().contains("退出");
		System.out.println(s1);
		driver.findElement(By.linkText("退出")).isEnabled();
				Thread.sleep(3000);
	

	

	}

}
