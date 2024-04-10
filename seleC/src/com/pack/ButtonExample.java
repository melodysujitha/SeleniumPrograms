package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
		WebElement position = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt94\']/span[2]"));
		Point xypoint = position.getLocation();
		int xval = xypoint.getX();
		int yval = xypoint.getY();
		System.out.println("X val = "+xval+" Y val= "+ yval);
		
		WebElement color = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/span[2]"));
		String colour = color.getCssValue("background-color");
		System.out.println(colour);
		
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println(height +"," +width);
		
	}

}
