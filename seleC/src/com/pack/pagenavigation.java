package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagenavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		
		w.get("https://www.amazon.in/");
		w.get("https://www.flipkart.com/");
		w.get("https://www.meesho.com/");
		
		w.navigate().back();
		Thread.sleep(5000);
		w.navigate().back();
		Thread.sleep(5000);
		
		w.navigate().forward();
		Thread.sleep(5000);
		w.navigate().forward();
		Thread.sleep(5000);
		
		w.close();
		w.quit();
		w.close();


	}

}
