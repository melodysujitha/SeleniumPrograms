package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrmLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver b =  new ChromeDriver();
		b.get("http://brm.tremplintech.in/web_pages/login.aspx");
		b.manage().window().maximize();
		
		b.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		b.findElement(By.cssSelector("#txt_pass")).sendKeys("admi");
		b.findElement(By.name("Button3")).click();
		
		Thread.sleep(5000);
		b.switchTo().alert().accept();
		Thread.sleep(5000);
	}

}
