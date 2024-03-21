package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	
	ChromeDriver driver;
	String ig="https://www.instagram.com/";
	
	@Before
	public void opn() {
		driver = new ChromeDriver();
		driver.get(ig);
	}
	
	@Test
	public void hio() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("Hello");
		
		WebElement search=driver.findElement(By.xpath("//form[@id='loginForm']/div/div[2]/div/label/input"));
		
		search.sendKeys("helloh",Keys.ENTER);
		
		//driver.findElement(By.xpath("//form[@id='loginForm']/div/div[3]")).click();
	}

}
