package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver112\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("melodysujitha@gmail.com");
		d.findElement(By.cssSelector("#pass")).sendKeys("Imb1essed");
		d.findElement(By.name("login")).click();
		
	}

}
