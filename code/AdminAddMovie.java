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
		wd.findElement(By.xpath("//h2[contains(.,'ӰƬ����')]")).click();

		wd.findElement(By.xpath("//a[@title='���ӰƬ']/span")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("filmname")).sendKeys("121212");
		wd.findElement(By.name("petname")).sendKeys("zhanlang");
		wd.findElement(By.name("director")).sendKeys("�⾩");
		wd.findElement(By.name("editor")).sendKeys("�⾩");
		wd.findElement(By.name("nation")).sendKeys("�й�");
		wd.findElement(By.name("language")).sendKeys("����");
		wd.findElement(By.name("showtime")).sendKeys("2017-11-01");

		wd.findElement(By.name("minutes")).sendKeys("120");
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\1122.png");
		Thread.sleep(3000);
	
//		wd.switchTo().frame(0);
		//����
//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).sendKeys("�����Ӱ����");
//		wd.switchTo().defaultContent();
//		wd.findElement(By.xpath("//button[contains(.,'����')]")).click();
		//���ϴ�����2.0�汾��û�������,����3.0����
		
   //�޸�Ϊ���µ���ʽ,����һ
//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).click();
//		wd.findElement(By.tagName("body")).sendKeys("�����Ӱ����");
//		wd.switchTo().defaultContent();
//		wd.findElement(By.xpath("//button[contains(.,'����')]")).click();
//		
		
		//�����������ӰƬ��飬�ü����¼��ķ�ʽ
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys("hello").perform();
//		action.sendKeys(Keys.TAB).perform();
//		action.sendKeys(Keys.ENTER).perform();
		
		//������
		wd.findElement(By.id("xhe0_iframe")).sendKeys("�����Ӱ����");
		Thread.sleep(30000);
		wd.findElement(By.xpath("//button[contains(.,'����')]")).click();
//		wd.findElement(By.xpath("//button[@type='submit']"));��仰�ǲ��е�
		Thread.sleep(30000);
		wd.quit();
	}

}
