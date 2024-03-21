package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbtitlev {
	WebDriver driver;
	By fbtitle =By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	
	public Fbtitlev(WebDriver driver) {
		this.driver=driver;
	}
	
	public void titlev() {
		driver.findElement(fbtitle).click();
		String exp="Facebook";
		String actul=driver.getTitle();
		if(exp.equals(actul)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}
}
