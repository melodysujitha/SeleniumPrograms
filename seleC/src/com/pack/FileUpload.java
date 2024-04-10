package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		String UploadURL = "https://demo.guru99.com/test/upload/";
		
		driver.get(UploadURL);
		driver.manage().window().maximize();
		
		WebElement fu = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		fu.sendKeys("D:\\NCS\\21-22 hanbook Final copy.docx");
		Thread.sleep(5000);
		
		WebElement chk = driver.findElement(By.cssSelector("#terms"));
	    chk.click();
		Thread.sleep(5000);
		
		WebElement sub =driver.findElement(By.id("submitbutton"));
		sub.click();
		Thread.sleep(5000);
		
		
		

	}

}
