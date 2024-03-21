package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Egexl {
    WebDriver driver;
    String h = "https://www.facebook.com/";

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void fgy() {
        driver.get(h);
    }

    @Test
    public void datadriver() {
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("C:\\Users\\thomas\\OneDrive\\Desktop\\Book1.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fi);
            XSSFSheet sh = wb.getSheet("Sheet1");
            int rowcount = sh.getLastRowNum();
            System.out.println(rowcount);
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
            for (int i = 1; i <= rowcount; i++) {
                String Username = sh.getRow(i).getCell(0).getStringCellValue();
                System.out.println("Username:" + Username);
                String Password = sh.getRow(i).getCell(1).getStringCellValue();
                System.out.println("Password:" + Password);
                driver.findElement(By.name("email")).clear();
                driver.findElement(By.name("email")).sendKeys(Username);
                driver.findElement(By.name("pass")).sendKeys(Password);
                driver.findElement(By.name("login")).click();
                wait.until(ExpectedConditions.urlContains("facebook.com"));
                // Log out or navigate back to the login page
                driver.get(h);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fi != null) {
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}