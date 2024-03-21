package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
	ChromeDriver driver;
	String h="https://janasya.com/";
	
	@Before
	public void hy() {
		driver=new ChromeDriver();
		driver.get(h);
	}
	@Test
	public void nh() {
		driver.findElement(By.xpath("//a[@href=\"/collections/new-arrival\"]/span")).click();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("saree", Keys.ENTER);
		
		List<WebElement> lin=driver.findElements(By.tagName("a"));
		System.out.println(lin.size());
		
	}

}
