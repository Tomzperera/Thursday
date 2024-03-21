package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sshotredif {
	ChromeDriver driver;
	String h="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void fro() {
		driver=new ChromeDriver();
		driver.get(h);
	}
	@Test
	public void ju() throws IOException {
		//taking ss of a webpage and storing it on drive
		File tr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(tr, new File("C:\\Users\\thomas\\Downloads/Redifss.png"));
		
		//single element ss
		WebElement ty=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		File src=ty.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Projctr/avltybtn.png"));
	}

}
