package testcases;

import org.testng.annotations.Test;

public class Kiran {

	@Test(dependsOnGroups = "sanity.*")
	public void test1() {
		System.out.println("test1");
	}
	
	
	
	@Test(groups= {"sanity1"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(groups= {"sanity2"})
	public void test4() {
		System.out.println("test4");
	}
}
