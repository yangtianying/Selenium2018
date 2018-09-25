package com.edu.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
//	1、通过@FindBy的方式找出所有涉及到操作的页面元素
//	2、通过构造方法初始化所有的元素,
//	PageFactory.initElements(driver, this);
	@FindBy(name="username")
	public WebElement username;
	
//	@FindBys
	
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement submitBtn;
	
	public  LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
