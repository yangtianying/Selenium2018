package com.edu.demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Person {

	
	
	public Person() {
		System.out.println("Person构造方法");
	}
	@BeforeClass
	public void bc() {
		System.out.println("Demo1--@BeforeClass");
	}
	@Test(groups= {"student"})
	public void student1() {
		System.out.println("student1");
	}
	@Test(groups= {"student"})
	public void student2() {
		System.out.println("Astudent2");
	}

	@Test(groups= {"teacher"})
	public void teacher1() {
		System.out.println("teacher1");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("@BeforeMethod");
	}

	@AfterMethod
	public void am() {
		System.out.println("@AfterMethod");
	}
}
