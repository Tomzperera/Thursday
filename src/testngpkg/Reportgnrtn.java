package testngpkg;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgnrtn {
	WebDriver driver;
	String t="https://www.wikipedia.org/";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void eto() {
		//to generate report
		reporter=new ExtentHtmlReporter("./Reports/myrprt.html");
		reporter.config().setDocumentTitle("Automation test report");//setting title
		reporter.config().setReportName("Functional test");//test name
		reporter.config().setTheme(Theme.DARK);
		
		//adding new entries
		extent = new ExtentReports();
		extent.attachReporter(reporter);//adding reference
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows");
		extent.setSystemInfo("testername", "thomas");
		extent.setSystemInfo("browser details", "chrome");
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void hui() {
		driver.get(t);
	}
	
	@Test
	public void startt() {
		test=extent.createTest("Fb Title Verification");
		String exp="Wikipediaer";
		String actul=driver.getTitle();
		Assert.assertEquals(exp, actul);
	}
	
	@AfterTest
	public void endss() {
		extent.flush();
	}
	
	@AfterMethod
	public void brwsrclose(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "test case passed is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "test case failed is "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
	}
}
