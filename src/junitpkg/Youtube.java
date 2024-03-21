package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	ChromeDriver driver;
	String ntflx="https://www.youtube.com/";
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get(ntflx);
	}
	@Test
	public void hjyu() {
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("weekend");
		search.submit();
		
		//driver.findElement(By.xpath("//div[@class=\"ytp-inline-preview-ui\"]/div[1]")).click();
		
	}

}
