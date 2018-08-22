package com.epam.cleartrip.suitBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseUtilityClearTrip {
    
	private static WebDriver driver = null;
	public Actions act = null;

	@Parameters({ "browserType" })
	@BeforeTest
	public void selectBrowser(String browserType) {

		System.out.println(" i am i  select browser");
		
		switch (browserType) {

		case "ff":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com/");
			act = new Actions(driver);
			break;

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\E\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com/");
			act = new Actions(driver);
			break;

		case "ie":
			System.setProperty("webdriver.chrome.driver", "D:\\E\\chromedriver_win32\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.cleartrip.com/");
			act = new Actions(driver);
			break;

		}
	}

	@AfterSuite
	public void tearDown() {

		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();

	}

	public WebDriver getDriver() {

		return driver;
	}
	
	public void selectAdultcountFJ(String count, WebElement element) {
		
		Select sl = new Select(element);
		sl.selectByVisibleText(count);
	}
	
	
}
