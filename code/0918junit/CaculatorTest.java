package com.edu.demo;

import org.junit.After;
import static  org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.matchers.*;

public class CaculatorTest {
	public CaculatorTest(){
		System.out.println("构造方法");
	}
	
//	public static void main(String[] args) {
//		Caculator cal = new Caculator();
//		System.out.println(cal.add(1, 3));
//	}
	static Caculator cal =null;
	@BeforeClass
	public static void BC(){
		System.out.println("@BeforeClass");
		cal = new Caculator();
	}
	
	@Before
	public void setUp(){
		System.out.println("setUp");
		 
	}

	@Ignore
	@Test
	public void testAdd2(){
		System.out.println("testAdd2");
		int result=cal.add(101, 2);
		assertEquals(103, result);

	}
	@Test
	public void testAdd1() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("testAdd1");
		int result=cal.add(1, 2);
		assertEquals(5, result);
//		assertThat(result, is(3));
//		assertThat(actual, );
	}
	
	@Test
//	@Test(expected=ArithmeticException.class)
	public void testDiv(){
		System.out.println("testDiv");
		int result=cal.div(1, 0);
		assertEquals(3, result);
	}

	@After
	public void tearDown(){
		System.out.println("tearDown");
//		cal=null;
	}
}
