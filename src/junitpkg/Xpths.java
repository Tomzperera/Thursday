package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpths {
	
	ChromeDriver driver;
	String u= "https://www.wikipedia.org/";
	
	@Before
	public void srs() {
		driver = new ChromeDriver();
		driver.get(u);
	}
	
	@Test
	public void brs() {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("The Last Supper");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
