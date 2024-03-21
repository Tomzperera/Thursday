package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Redifftestng {
	ChromeDriver driver;
	String h="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	@Test(priority=1)
	public void Logodisplay() {
		Boolean ert=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(ert) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
	}
	@Test(priority=2)
	public void Titleverify() {
		String exptd="Rediff";
		String actual=driver.getTitle();
		if(exptd.equals(actual)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	@Test(priority=3)
	public void ButtonV() {
		Boolean r=driver.findElement(By.xpath("//*[@id=\"Register\"]")).isEnabled();
		if(r) {
			System.out.println("Button is enabled");
		}else {
			System.out.println("Button is not enabled");
		}
	}
	@Test(priority=4)
	public void radiobtn() {
		Boolean mr=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(mr) {
			System.out.println("Button is selected");
		}else {
			System.out.println("Button is not selected");
		}
	}
	@Test(priority=5)
	public void content() {
		String vh=driver.getPageSource();
		String exptd="Create my account";
		if(vh.contains("Create my account")) {
			System.out.println("Content is present");
		}else {
			System.out.println("Not present");
		}
	}
	@Test(priority=6)
	public void Buttontextverify() {
		String fe=driver.findElement(By.xpath("//*[@id=\"Register\"]")).getAttribute("value");
		if(fe.equals("Create my account >>")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	@AfterTest
	public void ends() {
		driver.close();
	}

}
