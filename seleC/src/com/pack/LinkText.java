package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		String baseurl = "https://demo.guru99.com/test/link.html";
				
		driver.get(baseurl);
		driver.manage().window().maximize();
				
		WebElement lk = driver.findElement(By.linkText("click here"));
		lk.click();
		Thread.sleep(5000);
		driver.navigate().back();
				
		WebElement plk = driver.findElement(By.partialLinkText("click"));
	    plk.click();
		Thread.sleep(5000);
		driver.navigate().back();
						
				
	}
	
}
