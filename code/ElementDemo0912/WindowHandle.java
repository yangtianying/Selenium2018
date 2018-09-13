package com.edu.ElementDemo0912;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/test/table.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('http://localhost:8032/mymovie')");

		Set<String> windows = driver.getWindowHandles();

		System.out.println(windows.size());

		for (String w : windows) {
			boolean flag = driver.switchTo().window(w).getTitle().contains("ÒÆ¶¯");
			if (flag) {

				System.out.println(driver.getPageSource());
			}
		}

	}

}
