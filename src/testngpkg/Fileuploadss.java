package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadss {
	ChromeDriver driver;
	String h="https://demo.guru99.com/test/upload/";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	@Test
	public void files() {
		//fileupload through sendkeys
		WebElement yre=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		yre.sendKeys("C:\\Users\\thomas\\OneDrive\\Documents/Redifss.png");//path
		System.out.println("File is Uploaded Successfully");
		
		//checkbox is selected or not
		Boolean dr=driver.findElement(By.xpath("//*[@id=\"terms\"]")).isSelected();
		if(dr) {
			System.out.println("Checkbox is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
		
		//button text verify
		String yrr=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getAttribute("id");
		if(yrr.equals("submitbutton")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
