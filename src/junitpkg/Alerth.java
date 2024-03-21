package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerth {
	ChromeDriver driver;
	String y="file:///C:/Users/thomas/Downloads/alertx123.html";
	
	@Before
	public void rt() {
		driver=new ChromeDriver();
		driver.get(y);
	}
	
	@Test
	public void fre() {
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert h = driver.switchTo().alert();
		String v=h.getText();//to verify the text
		System.out.println(v);
		h.accept();//to aacept yes h.dismiss() to cancel the accept
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Thomas");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pereira");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
