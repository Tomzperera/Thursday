package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbk {
	ChromeDriver driver;
	String fb="https://www.facebook.com/";
	
	@Before
	public void fgt() {
	driver=new ChromeDriver();
	driver.get(fb);
	}
	
	@Test
	public void ddt() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ffghbg654@gmail.com");
		WebElement search=driver.findElement(By.xpath("//input[@type='password']"));
		search.sendKeys("htdefhg",Keys.ENTER);
	}

}
