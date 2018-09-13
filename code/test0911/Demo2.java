package com.edu.test0911;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/upupw32/htdocs/test/table.html");
//		WebElement table = driver.findElement(By.id("table1"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		System.out.println(rows.size());
//		for (WebElement row : rows) {
//			List<WebElement> cols = row.findElements(By.tagName("td"));
//			for(WebElement col :cols){
//				System.out.print(col.getText()+"\t");
//			}
//			System.out.println();
//		}
//		driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/input")).sendKeys("hello");
	
		driver.findElement(By.xpath("//td[contains(text(),'第三行第二列')]/input[2]")).click();
	}

}
