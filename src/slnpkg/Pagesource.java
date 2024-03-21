package slnpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "https://www.flipkart.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.get(s);
		String src = driver.getPageSource();
		if(src.contains("Login")) {
			System.out.println("Login successful");
		}
		else {
			System.out.println("Invalid");
		}
		driver.quit();
	}

}
