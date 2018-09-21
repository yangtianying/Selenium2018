package com.edu.screenshot;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener2 extends TestListenerAdapter{
	  @Override
	  public void onTestFailure(ITestResult tr) {
		  System.out.println(tr.getInstance()+"-"+tr.getName()+"运行失败，需要截屏");
		 
		  BaseTest tb = (BaseTest) tr.getInstance();
          WebDriver driver = tb.getDriver();    
		  SeleniumScreenShot ss = new SeleniumScreenShot(driver);
		  ss.screenShot();
		  
	  }
}
