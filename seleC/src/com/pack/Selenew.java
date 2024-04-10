package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenew {

	public static void main(String[] args) {
		System.setProperty("webdriver.Gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
		WebDriver m = new FirefoxDriver();
		m.get("https://www.facebook.com/");
		m.manage().window().maximize();
		m.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("melodysujitha@gmail.com");
		m.findElement(By.cssSelector("#pass")).sendKeys("Imb1essed");
		m.findElement(By.name("login")).click();

	}

}
