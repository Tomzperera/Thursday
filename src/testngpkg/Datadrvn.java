package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrvn {
	WebDriver driver;
    String h = "https://demo.guru99.com/popup.php";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void fgy() {
        driver.get(h);
    }

    @Test
    public void start() {
    	//return single window details
    	String parentwindow=driver.getWindowHandle();//current window
    	System.out.println("Parent Window Title: "+driver.getTitle());
    	driver.findElement(By.xpath("/html/body/p/a")).click();
    	
    	//returns multiple tab details
    	Set<String> allwindow=driver.getWindowHandles();
    	for(String handle: allwindow) {
    		if(!handle.equalsIgnoreCase(parentwindow)) {
    			driver.switchTo().window(handle);
    			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("acfgv435@gmail.com");
    			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
    			driver.close();// to close any of the tab
    		}
    		driver.switchTo().window(parentwindow);
    	}
    }
}
