package com.pack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("https://brm.tremplintech.in/web_pages/login.aspx");
		d.manage().window().maximize();
		Thread.sleep(2000);
		
		int a=100; //narrowing
		byte b;
		b=(byte) a;
		short s;
		s=(short) a;
		//(byte) ----type casting
		
		TakesScreenshot ts = (TakesScreenshot) d;  //(TakesScreensshot) ---type screen casting
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\ScreenShot\\Firstpage.jpg");
		FileHandler.copy(src, dest);
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		
		
		
	}

}
