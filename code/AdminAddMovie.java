package com.edu.test;

import org.apache.xmlbeans.impl.jam.annotation.WhitespaceDelimitedTagParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminAddMovie {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		Actions action = new Actions(wd);

		wd.get("http://localhost:8032/Mymovie/admin.php");
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		wd.findElement(By.xpath("//h2[contains(.,'影片管理')]")).click();

		wd.findElement(By.xpath("//a[@title='添加影片']/span")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("filmname")).sendKeys("121212");
		wd.findElement(By.name("petname")).sendKeys("zhanlang");
		wd.findElement(By.name("director")).sendKeys("吴京");
		wd.findElement(By.name("editor")).sendKeys("吴京");
		wd.findElement(By.name("nation")).sendKeys("中国");
		wd.findElement(By.name("language")).sendKeys("汉语");
		wd.findElement(By.name("showtime")).sendKeys("2017-11-01");

		wd.findElement(By.name("minutes")).sendKeys("120");
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\1122.png");
		Thread.sleep(3000);
	
//		wd.switchTo().frame(0);
		//或者
//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).sendKeys("这个电影不错");
//		wd.switchTo().defaultContent();
//		wd.findElement(By.xpath("//button[contains(.,'保存')]")).click();
		//以上代码在2.0版本是没有问题的,但是3.0不行
		
   //修改为以下的形式,方法一
//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).click();
//		wd.findElement(By.tagName("body")).sendKeys("这个电影不错");
//		wd.switchTo().defaultContent();
//		wd.findElement(By.xpath("//button[contains(.,'保存')]")).click();
//		
		
		//方法二，添加影片简介，用键盘事件的方式
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys("hello").perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.ENTER).perform();
		
		//方法三
		wd.findElement(By.id("xhe0_iframe")).sendKeys("这个电影不错");
		Thread.sleep(30000);
		wd.findElement(By.xpath("//button[contains(.,'保存')]")).click();
//		wd.findElement(By.xpath("//button[@type='submit']"));这句话是不行的
		Thread.sleep(30000);
		wd.quit();
	}

}
