package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitt {
	
	
	ChromeDriver driver;
	String e = "https://www.wikipedia.org/";
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get(e);
	}
	
	@Test
	public void verifytitle() {
		String exp="Wikipedia";
		String actult=driver.getTitle();
		if(exp.equals(actult)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}
	@After
	public void endss() {
		driver.quit();
	}

}
