package com.pack;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToTab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.seleniumeasy.com/test/");  //get(0)---Tab(1)
		
		Thread.sleep(5000);
		d.manage().window().maximize();
		
		// to get window property use GetWindowHandles
		// Window Property may single or multiple
		// Window property in the form of string
		
		((JavascriptExecutor) d).executeScript("window.open()");
		
		ArrayList<String> tab2 = new ArrayList<String>(d.getWindowHandles());    //get(1)---Tab(1)
		d.switchTo().window(tab2.get(1));
		d.get("http://google.com");
		Thread.sleep(2000);
		
		((JavascriptExecutor) d).executeScript("window.open()");
		
		ArrayList<String> tab3 = new ArrayList<String>(d.getWindowHandles());    //get(2)---Tab(1)
		d.switchTo().window(tab3.get(2));
		d.get("http://google.com");
		Thread.sleep(2000);
		
		ArrayList<String> tab1R = new ArrayList<String>(d.getWindowHandles());    
		d.switchTo().window(tab1R.get(0));
		d.get("http:/www.amazon.in");
		Thread.sleep(2000);
		
		ArrayList<String> tab2R = new ArrayList<String>(d.getWindowHandles());    
		d.switchTo().window(tab2R.get(1));
		d.get("http://www.flipcart.in");
		Thread.sleep(2000);
		
		ArrayList<String> tab3R = new ArrayList<String>(d.getWindowHandles());    
		d.switchTo().window(tab3R.get(2));
		d.get("http://www.facebook.com");
		Thread.sleep(2000);
		
		
		

	}

}
