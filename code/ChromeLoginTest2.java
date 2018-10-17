package com.chuanghui.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeLoginTest2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D://demo//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://main.test.119xiehui.com/Login/Index");
		// ��¼239  14W  225
		driver.findElement(By.id("loginname")).sendKeys("1111212");
		driver.findElement(By.id("loginpwd")).sendKeys("1111");
		driver.findElement(By.xpath("//input[@value='��¼']")).click();
		Thread.sleep(2000);
		//�����������
		driver.findElement(By.xpath("//p[contains(.,'��������')]")).click();
		Thread.sleep(2000);
		//�����Ա��Ϣ
		driver.findElement(By.xpath("//p[contains(.,'��Ա��Ϣ')]")).click();
		Thread.sleep(8000);
		driver.switchTo().frame(0);
		//�����Ӱ�ť
		driver.findElement(By.xpath("//div[@id='pagingdiv']/div[1]/div[1]")).click();
		Thread.sleep(5000);
		// ��������
		// driver.findElement(By.className("textName")).sendKeys("����");
		// ѡ���Ա�
		// driver.findElement(By.xpath("//div[contains(text(),'��ѡ���Ա�(����)')]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//li[@data-value='1']")).click();
		// ѡ������
		// driver.findElement(By.id("Enlisttime")).sendKeys("2015-05-05");
//		ѡ��������ò
		// driver.findElement(By.xpath("//div[contains(text(),'��ѡ��������ò(����)')]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//li[@data-value='19606']")).click();
//		ѡ��ѧ��
		// driver.findElement(By.xpath("//div[contains(text(),'��ѡ��ѧ��(����)')]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//li[@data-value='31298']")).click();
//	��ϵ�绰
		// driver.findElement(By.className("textContactnumber")).sendKeys("13910198899");
//		�뵳ʱ��
		// driver.findElement(By.id("textJoinparty")).sendKeys("2014-05");
//		JavascriptExecutor�ƶ����λ��
		// JavascriptExecutor jse=(JavascriptExecutor)driver;
		// jse.executeScript("window.scrollBy(0,1000)");
		// jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// driver.findElement(By.className("textWeight")).sendKeys(Keys.DOWN);
		// Thread.sleep(2000);

		Actions action = new Actions(driver);
//�������¼�
		action.sendKeys(Keys.DOWN).build().perform();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
//		*******************************
		//����ѡ���ŵĲ���
		driver.findElement(By.xpath("//div[contains(text(),'��ѡ����(����)')]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//ul[@class='department-list']/li[2]/div/div[1]/span"));
		System.out.println(element.isDisplayed());
		System.out.println(element.isEnabled());
		//��ֱ��clickû����Ӧ��������jsִ������click
		jse.executeScript("arguments[0].click();", element);

		//��ס��������ƶ�600�������ƶ�200���ͷ����
		action.clickAndHold().moveByOffset(600, 200).release().perform();
		Thread.sleep(2000);
		//��������ϵ����¼�ͷ
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		//���ȷ����ť
		driver.findElement(By.xpath("//div[@title='ѡ����']/div/div[3]/input[1]")).click();
//		*******************************
		//�����Ա���ҳ��ġ�ȷ������ť
		action.click();
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='ȷ��']")).click();
		// /������˳����������������
		// driver.quit();
		// //�رյ�ǰҳ��
		// driver.close();
	}

}
