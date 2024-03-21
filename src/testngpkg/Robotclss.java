package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Robotclss {
	ChromeDriver driver;
	String h="https://www.ilovepdf.com/pdf_to_word";
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void fgy() {
		driver.get(h);
	}
	
	@Test
	public void fileupload() throws Exception{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click(); //button click
		
		filupd("\"C:\\Users\\thomas\\Downloads\\Screenshot (1402).pdf\"");//path
	}
	

	public void filupd (String p) throws AWTException {
			StringSelection strSelection = new StringSelection(p);//obj create
			//to set path in the clipboard
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
			//to paste path in the filename field
			Robot robot=new Robot();
			
			robot.delay(3000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
	}

}
