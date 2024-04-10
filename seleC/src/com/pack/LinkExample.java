package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://leafground.com/link.xhtml");
		
		WebElement link1= driver.findElement(By.partialLinkText("Dashboard"));
		link1.click();
		
		driver.navigate().back();
		
		WebElement destiny = driver.findElement(By.partialLinkText("Find the"));
		String page = destiny.getAttribute("href");
		
		System.out.println("this page is going to"+page);
		
		
		WebElement broken = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[3]/div/div/a"));
		broken.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Broken Link");
		}
		
		driver.navigate().back();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int total = list.size();
		System.out.println(total);
		
		

	}

}
