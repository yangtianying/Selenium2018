package example;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Test2 {
	
	
	@Test
	public void  a4(ITestContext context) {
		
		System.out.println(context.getAttribute("name"));
		Assert.assertTrue(false);
		
	}
	

}
