package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		k.get("https://jqueryui.com/slider/");
		
		k.switchTo().frame(0);
		WebElement slider = k.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Thread.sleep(3000);
		
		for(int i=1;i<=90;i++) {
			slider.sendKeys(Keys.ARROW_RIGHT);
		}
		Thread.sleep(3000);
		for(int i=90;i>=0;i--) {
			slider.sendKeys(Keys.ARROW_LEFT);
		}
		Thread.sleep(3000);

	}

}
