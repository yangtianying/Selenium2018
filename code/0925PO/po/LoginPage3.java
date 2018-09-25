package com.edu.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

public class LoginPage3 extends LoadableComponent<LoginPage3>{

	public WebDriver driver =null;
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitBtn;
	

	
	public LoginPage3() {
		System.setProperty("webdriver.gecko.driver", "D:\\demo\\geckodriver.exe");
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
	}
	

	
	public void login(String u_name,String u_password) throws InterruptedException {
		
		this.username.sendKeys(u_name);
		this.password.sendKeys(u_password);
		this.submitBtn.click();
		Thread.sleep(3000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void quitBrowser() {
		this.driver.quit();
	}
	
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(this.driver.getTitle().contains("»ùÓÚThinkPHP"));
		
	}

	@Override
	protected void load() {
		
		this.driver.get("http://localhost:8032/mymovie/admin.php/");
	}

}
