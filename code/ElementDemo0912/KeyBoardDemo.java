package com.edu.ElementDemo0912;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Actions action = new Actions(driver);
		driver.get("http://localhost:8032/mymovie/admin.php/Login/index.html");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		action.sendKeys(Keys.TAB).build().perform();
	
		action.sendKeys(Keys.ENTER).build().perform();
//		action.contextClick(target)
//		action.sendKeys(Keys.DOWN).build().perform();
		
	}

}
