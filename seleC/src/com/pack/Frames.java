package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver fr = new ChromeDriver();
		fr.get("https://demo.automationtesting.in/Frames.html");
		fr.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement button1 = fr.findElement(By.xpath("//a[@href='#Single']"));
		button1.click();
		
		WebElement frame1 = fr.findElement(By.xpath("//iframe[@id='singleframe']"));
		fr.switchTo().frame(frame1);
		
		WebElement textbox = fr.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Testing");
		Thread.sleep(2000);
		
		fr.switchTo().defaultContent();
		Thread.sleep(2000);
		
		
		
		WebElement button2 = fr.findElement(By.xpath("//a[@href='#Multiple']"));
		button2.click();
		
		WebElement frameB = fr.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		fr.switchTo().frame(1);
		Thread.sleep(2000);
		
		WebElement frameS = fr.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		fr.switchTo().frame(0);
		
		WebElement txtbox = fr.findElement(By.xpath("//input[@type='text']"));
		txtbox.sendKeys("Selenium");
		Thread.sleep(2000);
		
		fr.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}

}
