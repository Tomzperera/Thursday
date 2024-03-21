package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	ChromeDriver driver;
	String j="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void fgt() {
		driver = new ChromeDriver();
		driver.get(j);
	}
	
	@Test
	//date selection
	public void gt() {
		WebElement days=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select ob=new Select(days);//parameterized constructor
		ob.selectByValue("18");
		
		WebElement fy=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select fyt=new Select(fy);
		fyt.selectByVisibleText("NOV");
		
		WebElement rtr=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select hu=new Select(rtr);
		hu.selectByValue("1999");
	}

}
