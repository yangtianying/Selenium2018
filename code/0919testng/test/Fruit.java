package com.edu.test;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Fruit {

	public Fruit() {
		System.out.println("Fruit");
	}
	
//	@Parameters({"ip","username"})
//	@Test
//	public void apple(String address,String name) {
//		System.out.println("apple");
//		Reporter.log("≤‚ ‘±®∏Ê");
//		System.out.println(address);
//		System.out.println(name);
//	}
	
	@Test
	public void pear() {
		System.out.println("pear");
	
	}
	
	@Test
	public void bananan() {
		System.out.println("bananan");
	}
	
	@Test
	public void orange() {
		System.out.println("orange");
	}
	
	@DataProvider(name="user")
	public Object [][] getData(){
		return new Object[][] {{"tom01","tom001","123456"},
			{"tom02","tom002","1qazeere"}};
			
	}
	
	@Test(dataProvider="user")
	public void testData(String username,String password,String pwd) {
		System.out.println(username+"\t"+password+"\t"+pwd);
	}
	@Test(dataProviderClass=TxtReader.class)
	public void test1(String username) {
		
	}
}
