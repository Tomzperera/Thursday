package testngpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonauto {
	WebDriver driver;
    String h = "https://www.amazon.in/";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void fgy() {
        driver.get(h);
        driver.manage().window().maximize();
    }
//handling multiple tabs
    @Test
    public void start() {
    	
    	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones");
    	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
    	
    	String exptd="Amazon.in : mobile phones";
		String actual=driver.getTitle();
		if(exptd.equals(actual)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		Set<String> allwindow=driver.getWindowHandles();
		
    	for(String handle: allwindow) {
    		if(!handle.equalsIgnoreCase(parentwindow)) {
    			driver.switchTo().window(handle);
    			//to select add to cart: full xpath(absolute)
    			driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
    			//press cart 
    			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));//explicit wait applied
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"))).click();
    			driver.close();
    }
    		driver.switchTo().window(parentwindow);
}
}
}