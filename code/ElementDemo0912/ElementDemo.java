package com.edu.ElementDemo0912;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/test/frame.html");

		// Select f= new Select(driver.findElement(By.name("fruit")));
		// f.selectByValue("peach");
		// Thread.sleep(3000);
		// f.selectByVisibleText("4桔子");

		// WebElement hobby=driver.findElement(By.name("hobby"));
		// Select h= new Select(hobby);
		//
		// System.out.println(h.isMultiple());
		// h.selectByIndex(0);
		// h.selectByValue("reading");
		// h.selectByVisibleText("3旅游");

		// List<WebElement> fCheckBox =
		// driver.findElements(By.xpath("//*[@type='checkbox']"));
		// for (WebElement f : fCheckBox) {
		// f.click();
		//
		// }

//		driver.findElement(By.id("file")).sendKeys("2004-09-01");
//		Thread.sleep(3000);
//		driver.findElement(By.id("filesubmit")).click();
//		System.out.println(driver.findElement(By.xpath("//h1")).getText());
	
		
//		driver.findElement(By.id("btn1")).click();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();

		driver.switchTo().frame("leftframe");
		
		driver.findElement(By.id("uname")).sendKeys("hello");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();//回到主页面
		driver.switchTo().frame("middleframe");
		driver.quit();
	}

}
