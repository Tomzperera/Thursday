package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
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
	
	//copy paste
	@Test
	public void ft() {
		WebElement namee=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement redifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		namee.sendKeys("Thomas");
		Actions act = new Actions(driver);//object creation through constructor
		act.keyDown(namee,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);//select
		act.keyDown(namee,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);//copy
		act.keyDown(redifid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);//paste
		act.perform();
		}

}
