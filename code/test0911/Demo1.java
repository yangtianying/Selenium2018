package com.edu.test0911;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\demo\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://localhost:8032/mymovie/");
		
		wd.findElement(By.linkText("ÐÂÎÅ")).click();
		wd.findElement(By.partialLinkText("ÐÂ")).click();
		
		

	}

}
