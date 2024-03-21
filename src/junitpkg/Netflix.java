package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	
	ChromeDriver driver;
	String ntflx="https://www.netflix.com/in/";
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get(ntflx);
	}
	
	@Test
	public void ghyi() {
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thbjuiygt44@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hjbjhbnj");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.navigate().back();
		
	}

}
