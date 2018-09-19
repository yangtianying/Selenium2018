package com.edu.demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Animal {
	@BeforeSuite
	public void bs() {
		System.out.println("Animal--@BeforeSuite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("Animal--@BeforeTest");
	}
	
	@AfterTest
	public void at() {
		System.out.println("Animal--@AfterTest");
	}
	
	@Test(dependsOnMethods= {"dog"})
	public void cat() {
		System.out.println("cat");
	}
	
	@Test(groups={"student"})
	public void dog() {
		System.out.println("dog");
	}

}
