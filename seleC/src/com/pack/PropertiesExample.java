package com.pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PropertiesExample {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = null;

		FileInputStream stream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		String browser = properties.getProperty("browser");
		String Location = properties.getProperty("fileLocation");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",Location);
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")){
			System.out.println("Browser is not available");
		}
		
		driver.get("http://www.google.com");
		Thread.sleep(3000);

	}

}
