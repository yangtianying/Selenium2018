package com.edu.ElementDemo0912;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8032/test/table.html");

//		WebElement table=driver.findElement(By.tagName("table"));
//		List<WebElement> rows=table.findElements(By.tagName("tr"));
//		System.out.println(rows.size());
//		
//		for(WebElement row:rows){
//			List<WebElement> cols =row.findElements(By.tagName("td"));
//			for(WebElement col :cols){
//				System.out.print(col.getText()+"\t");
//			}
//			System.out.println();
//		}
		
//		String title=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
//	
//		System.out.println(title);
		
		driver.findElement(By.xpath("//td[contains(text(),第三行第二列)]/input[@type='checkbox']")).click();
	}

}
