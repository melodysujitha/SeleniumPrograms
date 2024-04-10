package com.pack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		WebElement button = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[1]/a"));
		button.click();
		Thread.sleep(3000);
		
		File location = new File("C:/Users/SONY/Downloads");
		File [] allfiles = location.listFiles();
		
		for (File file : allfiles) {
			if(file.getName().equals("samplefile.pdf")) {
				System.out.println("File is downloading");
				break;
			}
			
		}
		driver.close();
	}

}
