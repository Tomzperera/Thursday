//Amazon site automation
package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzn {
	
	ChromeDriver driver;
	String amz="https://www.amazon.in/";
	
	@Before
	public void buy() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();//to maximize the automation window
		driver.get(amz);
	}
	
	@Test
	public void bei() {
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));//search mobile
		search.sendKeys("mobiles");
		search.submit();
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();//click related elements

		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();//sign in
		
		driver.navigate().back();//go back
		
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();//cart
		
		driver.navigate().back();//go back
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();//open hamburger menu
		
		//driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click(); //close hamburger menu
	}
	

}
