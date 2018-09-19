package com.edu.test0917;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/test/demo5.html");

		try {
			driver.findElement(By.linkText("登录1")).click();
		} catch (NoSuchElementException ex) {
			
			File source =((TakesScreenshot)driver).
					getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File( "d:\\demo\\0917.jpg"));
			
			System.out.println("该元素不存在");
		} finally {
			boolean s1 = driver.findElement(By.name("dispaly")).isDisplayed();
			if (s1) {
				System.out.println("此元素可见");
			}
		}

	}

}
