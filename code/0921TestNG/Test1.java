package example;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Test1 {
	@Test
	public void a1() {
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void a2() {
		Assert.assertEquals(1, 1);
	}
	
//	@Test
//	public void  a3(ITestContext context) {
//		context.setAttribute("name", "tom");
//		
//	}
	
//	@BeforeClass
//	public void bc() {
//		System.out.println("Test1-@BeforeClass");
//	}
//	
//	@AfterMethod
//	public void ac(ITestResult result) {
//		System.out.println("类名："+result.getInstance());
//		System.out.println("测试结果："+result.getStatus());
//		System.out.println("测试方法名："+result.getName());
//		System.out.println("报错信息："+result.getThrowable());
//	}
	@Test(enabled=false)
	public void a4() {
		System.out.println("enabled=false");
	}
	

	

}
