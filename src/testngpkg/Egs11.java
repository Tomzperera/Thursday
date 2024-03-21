package testngpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Egs11 {
	ChromeDriver driver;
	String h="https://demo.guru99.com/test/simple_context_menu.html";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	@Test
	public void hello() {
		Actions act = new Actions(driver);
		
		WebElement er=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(er).perform();//right click
		
		WebElement wer=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		wer.click();//selecting edit option from rt click
		Alert rt=driver.switchTo().alert();
		rt.accept();
		
		WebElement xyz=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(xyz).perform();//double click
		Alert popup=driver.switchTo().alert();
		System.out.println("Alert Text: " +popup.getText());//to display alert text
		popup.accept();
		
	}

}
