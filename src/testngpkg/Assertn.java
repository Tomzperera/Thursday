package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertn {
	WebDriver driver;
    String h = "https://www.facebook.com/";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void fgy() {
        driver.get(h);
        driver.manage().window().maximize();
    }

	@Test
    public void gyu() {
    	String exp="Facebook";
    	String actul=driver.getTitle();
    	//System.out.println(driver.getTitle());
    	Assert.assertEquals(actul, exp);
    	
    	System.out.println("gyrt");
    }

}
