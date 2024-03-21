package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradio {
	ChromeDriver driver;
	String h="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void fro() {
		driver=new ChromeDriver();
		driver.get(h);
	}
	@Test
	public void fhy() {
		Boolean radio=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(radio) {
			System.out.println("Button is displayed");
		}else {
			System.out.println("Button is not displayed");
		}
	}

}
