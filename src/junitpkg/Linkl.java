package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkl {
	ChromeDriver driver;
	String v="https://www.flipkart.com/";
	
	@Before
	public void fy() {
		driver = new ChromeDriver();
		driver.get(v);
	}
	
	@Test
	public void fre() {
		List<WebElement> linkll=driver.findElements(By.tagName("a"));
		System.out.println(linkll.size());
		for (WebElement link : linkll) {  ///foreach loop
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");
            System.out.println("Link Text: " + linkText + ", URL: " + linkUrl);
		}

}
}
