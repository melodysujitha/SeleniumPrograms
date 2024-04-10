package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		
		WebElement dc= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		a.doubleClick(dc).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		WebElement rc = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		a.contextClick(rc).perform();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]/span"));
		menu.click();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}

}
