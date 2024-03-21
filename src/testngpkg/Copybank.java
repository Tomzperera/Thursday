package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copybank {
	ChromeDriver driver;
	String h="https://demo.guru99.com/test/drag_drop.html";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	//copy paste bank
	@Test
	public void strt() {
		Actions act = new Actions(driver);
		
		WebElement v1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement v2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		WebElement v3=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement v4=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		
		WebElement v5=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement v6=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		
		WebElement v7=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement v8=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		
		act.dragAndDrop(v1,v2).build().perform();
		act.dragAndDrop(v3,v4).build().perform();
		act.dragAndDrop(v5,v6).build().perform();
		act.dragAndDrop(v7,v8).build().perform();
		
		if(driver.findElement(By.xpath("//*[@id=\"equal\"]/a")).isDisplayed())
		{		
         	System.out.println("Perfect");					
     	}
		else
     	{
        	System.out.println("Error");					
     	}
		
	}

}
