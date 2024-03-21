package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginusr {
	ChromeDriver driver;
	String rt="https://www.facebook.com/";
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get(rt);
	}
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("anfd654@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("hello");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void stops() {
		driver.quit();
	}

}
