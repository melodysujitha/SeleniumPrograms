package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver", "D:\\WebDrivers\\msedgedriver.exe");
		WebDriver m = new EdgeDriver();
		m.get("https://www.facebook.com/");
		m.manage().window().maximize();
		m.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("melodysujitha@gmail.com");
		m.findElement(By.cssSelector("#pass")).sendKeys("Imb1essed");
		m.findElement(By.name("login")).click();

	}

}
