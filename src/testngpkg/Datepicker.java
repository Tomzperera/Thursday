package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
	WebDriver driver;
    String h = "https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=Cj0KCQiA84CvBhCaARIsAMkAvkK2RU0n0r9Vv37sQ9qlx09wEXNTck7ybsXS8Rty3syeIg0CBcrwlukaAi1BEALw_wcB";

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
    public void startt() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.navigate().refresh();
    	
    	driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[4]/div/div/div[1]/div[3]")).click();
    	while(true) {
    		//march xpath
    	WebElement rty=driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div"));
    	String monthtxt = rty.getText();
    	System.out.println(monthtxt);
    	
    	if(monthtxt.equals("May 2024")) {
    	    break;
    	}
    	else {
    	    //right arrow
    	    driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
    	}

    }
    	//calender full selection
    	List<WebElement> li=driver.findElements(By.xpath("//*[@id=\\\"root\\\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div/div/p"));
    	for(WebElement ele: li) {
    		String date=ele.getText();
    		if(date.equals("24")) {
    			ele.click();
    		}
    	}
    	driver.findElement(By.xpath("//*[@id=\\\"root\\\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
    }
    

}
