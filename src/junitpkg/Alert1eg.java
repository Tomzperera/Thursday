package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1eg {
	ChromeDriver driver;
	String y="file:///C:/Users/thomas/Downloads/alertx123.html";
	
	@Before
	public void rt() {
		driver=new ChromeDriver();
		driver.get(y);
	}
	
	@Test
	public void xy() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Thomas");
		
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Pereira");
		
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
