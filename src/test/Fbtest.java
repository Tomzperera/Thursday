package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fbtest {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void logintest() {
		Fbloginpage ob = new Fbloginpage(driver);// calling to page package
		ob.setvalues("abfg565@gmail.com", "fyvbuyb665");
		ob.login();
	}

}
