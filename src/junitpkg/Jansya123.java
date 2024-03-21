package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jansya123 {
	ChromeDriver driver;
	String h="https://janasya.com/";
	
	@Before
	public void hy() {
		driver=new ChromeDriver();
		driver.get(h);
		String expt = "Janasya";
		String actualt = driver.getTitle();
		if(expt.equals(actualt)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	
	@Test
	public void dtu() {
		driver.findElement(By.xpath("//a[@href=\"/collections/new-arrival\"]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[1]/h3")).click();
		
		driver.findElement(By.xpath("//*[@id=\"halo-sidebar\"]/div[2]/div[1]/div[2]/div/ul/li[1]/a/span")).click();
	}

}
