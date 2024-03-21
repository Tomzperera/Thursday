package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleb {
	
	ChromeDriver driver;
	String hj="https://www.google.com/";
	
	@Before
	public void hui() {
		driver=new ChromeDriver();
		driver.get(hj);
	}
	
	@Test
	public void fgy() {
		WebElement search = driver.findElement(By.xpath("//textarea[@name='q']"));
		search.sendKeys("Nike",Keys.ENTER);
	}

}
