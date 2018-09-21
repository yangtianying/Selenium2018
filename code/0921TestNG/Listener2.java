package example;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener2 extends TestListenerAdapter
{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"执行成功了");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"执行失败了，执行截屏的操作");
		
	}

}
