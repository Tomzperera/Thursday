package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@BeforeTest
	public void starts() {
		System.out.println("Load page");
	}
	@BeforeMethod
	public void mtds() {
		System.out.println("Page activities");
	}
	
	@Test(priority=2,dependsOnGroups= {"Test 2"})
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(priority=1,enabled=false)
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("Test 3");
	}

	@AfterMethod
	public void mtdend() {
		System.out.println("Bei bei");
	}
	@AfterTest
	public void ends() {
		System.out.println("Tata");
	}

}
