package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	
	WebDriver driver;
	long startTime;
	long endTime;
	long Total;
	
	
	@BeforeSuite
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		startTime = System.currentTimeMillis();
	}
	
	@Test
	public void Google() {
		driver.get("www.google.com");
	}
	
	@Test
	public void Yahoo() {
		driver.get("www.yahoo.co.in");
	}

	@Test
	public void Bing() {
		driver.get("www.bing.com");
	}

	@AfterSuite
	public void exit() {
		driver.quit();
		endTime = System.currentTimeMillis();
		Total= endTime - startTime;
		System.out.println(Total);
		
	}

}
