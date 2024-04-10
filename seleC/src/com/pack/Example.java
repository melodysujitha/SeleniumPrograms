package com.pack;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://leafground.com/frame.xhtml");
		  driver.switchTo().frame(0);
		  WebElement button = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		  button.click();
		  
		  String text = button.getText();
		  System.out.println(text);
		  
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(2);
		  driver.switchTo().frame("frame2");
		  WebElement nest = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		  nest.click();
		  
		  driver.switchTo().defaultContent();
		  List<WebElement> total = driver.findElements(By.tagName("iframe"));
		  int size = total.size();
		  System.out.println(size);
		  
		  
		  
	}
}