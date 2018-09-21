package example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

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

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getInstanceName()+"-"+result.getName()+
				"跳过了");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
