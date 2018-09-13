package com.edu.test0911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lihuanzhen {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
//		System.setProperty("webdriver.firefox.bin", "");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();//最大化浏览器
		
		driver.get("https://www.baidu.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource().contains("新闻"));
		System.out.println(driver.getTitle());
	
//		driver.findElement(By.id("kw")).sendKeys("淘宝");
		
//		WebElement keyword=driver.findElement(By.name("wd"));
//		keyword.sendKeys("京东");
		
//		driver.findElement(By.id("su")).click();
//		Thread.sleep(5000);
//		driver.navigate().back();//浏览器后退
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.navigate().to("https://www.baidu.com/");
		
		
		
		driver.quit();
//		driver.close();
		
	}

}
