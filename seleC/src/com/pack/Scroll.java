package com.pack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://demo.guru99.com/test/guru99home/");
		d.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		
		//it will go till the pixel specified
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(10000);
		
		js.executeScript("window.scrollBy(0,-1000)");
		
		// per page 700x
		
		//it will go till the end vertically
		((JavascriptExecutor) d).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
		//it will come up vertically
		((JavascriptExecutor) d).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		Thread.sleep(2000); 
		
		
		
				

	}

}
