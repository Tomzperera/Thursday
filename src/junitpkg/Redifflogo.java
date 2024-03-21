package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo {
	ChromeDriver driver;
	String h="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void fro() {
		driver=new ChromeDriver();
		driver.get(h);
	}
	@Test
	public void gta() {
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
	}

}
