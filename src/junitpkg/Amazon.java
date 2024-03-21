//facebook website automation
package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	String es="https://www.facebook.com/";
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get(es);
	}
	@Test
	public void purchase() {
		//driver.findElement(By.xpath("//input[@type='text'])"));
		driver.findElement(By.name("pass")).sendKeys("xftuieb@9127");
		driver.findElement(By.name("login")).click();
	}
	@After
	public void stops() throws InterruptedException {
		Thread.sleep(300);
		driver.quit();
	}

}
