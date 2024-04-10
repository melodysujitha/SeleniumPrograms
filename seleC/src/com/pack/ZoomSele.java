package com.pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomSele {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("http://automationpratice.com/index.php");
		
		((JavascriptExecutor) d).executeScript("document.body.style.zoom='40%'");
		
		Thread.sleep(2000);
		((JavascriptExecutor) d).executeScript("document.body.style.zoom='100%'");
		
		//zoom - selenium dimension change  

	}

}
