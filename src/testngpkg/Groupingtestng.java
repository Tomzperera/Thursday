package testngpkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingtestng {
	@BeforeTest
	public void starts() {
		System.out.println("Load page");
	}
	@Test(groups= {"smoke"})
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(groups= {"smoke","sanity"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups= {"regression","penetration"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups= {"smoke","performance"})
	public void test4() {
		System.out.println("Test 4");
	}
	

}
