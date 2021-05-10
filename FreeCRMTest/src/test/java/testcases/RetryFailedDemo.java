package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryFailedDemo {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
		//int i=1/0;
	}
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test3() {
		System.out.println("test3");
		Assert.assertTrue(2>3);
	}
}
