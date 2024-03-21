package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonaboutus {
	WebDriver driver;
    String h = "https://www.ebay.com/";

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
    public void hyu() {
    	//to scroll down to bottom of the page
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    	//element locating through xpath
    	driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/a")).click();
    }

}
