package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagerefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver m =  new ChromeDriver();
		m.get("https://www.facebook.com/");
		m.manage().window().maximize();
		
		
		m.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		m.navigate().refresh();
		Thread.sleep(5000);
		m.navigate().refresh();
		Thread.sleep(5000);
		m.navigate().refresh();
		Thread.sleep(5000);

	}

}
