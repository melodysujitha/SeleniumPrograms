package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToViewJS {

	public static void main(String[] args) throws InterruptedException {
	WebDriver wd;
	System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
	wd = new ChromeDriver();
	wd.manage().window().maximize();
	
	String url = "https://www.tutorialspoint.com/index.htm";
	wd.get(url);
	
	//identify element 
	WebElement DS = wd.findElement(By.xpath("//div[contains(text(),'Data Structure')]"));
	
	((JavascriptExecutor)wd).executeScript("arguments[0].scrollIntoView(true);", DS);
	Thread.sleep(8000);
	
	
		
	}

}
