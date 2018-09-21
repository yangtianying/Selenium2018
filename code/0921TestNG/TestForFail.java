package example;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestForFail {

	public static void main(String[] args) {
		TestNG testNg = new TestNG();
		List<String> suite= new ArrayList<String>();
		suite.add(".\\test-output\\testng-failed.xml");
		testNg.setTestSuites(suite);
		testNg.run();
		

	}

}
