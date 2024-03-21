package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb2 {
	WebDriver driver;
	
	By fbsignup=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbsubutton =By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a");
	
	public Fb2(WebDriver driver) {
		this.driver=driver;
	}
	
	public void hello() {
		driver.findElement(fbsignup).click();
		driver.findElement(fbsubutton).click();
	}

}
