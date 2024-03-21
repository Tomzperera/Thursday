package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginauto {
	ChromeDriver driver;
	String h="https://automationexercise.com/login";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	@Test
	public void starts() {
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("thomaspereira736@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("Thomasp@18");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		String actual = driver.getCurrentUrl();
		System.out.println("Current URL after login:"+actual);
		
		String exptd="https://automationexercise.com/";
		if(actual.equals(exptd)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
