package com.edu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdminAddRole {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver wd = new FirefoxDriver();
		Actions action = new Actions(wd);

		wd.get("http://localhost:8032/Mymovie/admin.php");
		wd.findElement(By.name("username")).sendKeys("admin");
		wd.findElement(By.name("password")).sendKeys("admin");
		wd.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		WebElement frame=wd.findElement(By.xpath("//iframe[contains(@id��'_iframe')]"));
		wd.switchTo().frame(frame);
		
		wd.findElement(By.xpath("//h2[contains(.,'FolderӰƬ����')]")).click();
		wd.findElement(By.xpath("//*[@id='sidebar']/div[2]/div[6]/ul/li[2]/div/div[1]")).click();
		wd.findElement(By.xpath("//a[@title='�����Ա��Ϣ']")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("cname")).sendKeys("����");
		wd.findElement(By.name("ename")).sendKeys("jessie");
		wd.findElement(By.xpath("//input[@name='sex'][2]")).click();
		wd.findElement(By.name("birthday")).sendKeys("1983-09-15");
		wd.findElement(By.name("bornaddress")).sendKeys("ʯ��ׯ");
		
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\1122.png");
//		ʾ������
//		Select star =new Select(wd.findElement(By.name("constellation")));
//		star.selectByValue("˫����");
//		ʾ������ElementNotInteractableException
//		Select star =new Select(wd.findElement(By.tagName("select")));
//		star.selectByValue("˫����");
		wd.findElement(By.name("constellation")).click();
		wd.findElement(By.linkText("ʨ����")).click();
//	��ִ��	
//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).sendKeys("hello");
//		wd.switchTo().defaultContent();
		
		wd.findElement(By.name("professtion")).sendKeys("��Ա");

		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys(Keys.DELETE).perform();
		action.sendKeys("hello").perform();
		Thread.sleep(30000);
		action.sendKeys(Keys.TAB).perform();
		action.sendKeys(Keys.ENTER).perform();
		
//		
//		Thread.sleep(30000);
//		wd.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(30000);
		
	}
	

}
