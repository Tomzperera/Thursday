package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinkflpkt {
	String y ="https://www.google.com";
	ChromeDriver driver;
	
	@Before
	public void ert() {
		driver=new ChromeDriver();
		driver.get(y);
	}
	
	@Test
	public void fg() {
		List<WebElement> lis=driver.findElements(By.tagName("a"));
		System.out.println("Total link count: "+lis.size());
		for(WebElement el:lis) {
			String link=el.getAttribute("href");//el-temporary variable
			verify(link);
		}
	}

	private void verify(String link) {//method to verify the link
		try {
			URL u=new URL(link);
			HttpURLConnection gt=(HttpURLConnection)u.openConnection();
			gt.connect();
			if(gt.getResponseCode()==200) {
				System.out.println("Success 200");
			}
			else if(gt.getResponseCode()==404) {
				System.out.println("Broken link 404");
			}
			else {
				System.out.println("Failed");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
