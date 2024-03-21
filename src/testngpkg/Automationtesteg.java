package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationtesteg {
	WebDriver driver;
    String h = "https://automationexercise.com/";

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
    public void vgy() {
    	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("Thomas");
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("fduis705@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
    	
    	WebElement fty=driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
    	fty.click();
    	
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("kijuyyf@456");
    	//dob selection
    	WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
    	Select ob=new Select(day);
    	ob.selectByValue("18");
    	
    	WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
    	Select ob1=new Select(month);
    	ob1.selectByVisibleText("November");
    	
    	WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
    	Select ob3=new Select(year);
    	ob3.selectByValue("1999");
    	
    	WebElement yu=driver.findElement(By.xpath("//*[@id=\"optin\"]"));
    	yu.click();
    	
    	driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Thomas");
    	driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("Pereira");
    	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("Xyz");
    	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Kollam, Kerala");
    	
    	WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
    	Select ct=new Select(country);
    	ct.selectByValue("India");
    	
    	driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Kerala");
    	
    	driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Karunagappally");
    	driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("690547");
    	driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("6282438980");
    	
    	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
    }

}
