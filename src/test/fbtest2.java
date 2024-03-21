package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fb2;
import page.Fbtitlev;

public class fbtest2 {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void startt() {
		//Fb2 ob2=new Fb2(driver);
		//ob2.hello();
		Fbtitlev ob3=new Fbtitlev(driver);
		ob3.titlev();
	}

}
