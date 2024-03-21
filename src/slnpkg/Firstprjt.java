package slnpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprjt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//to launch chrome browser
		driver.get("https://www.wikipedia.org/");//to load the entered url
		String expt = "Wikipedia";
		String actualt = driver.getTitle();
		if(expt.equals(actualt)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		driver.quit();

	}

}
