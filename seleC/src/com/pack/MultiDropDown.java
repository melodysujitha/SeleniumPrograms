package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver r =  new ChromeDriver();
		r.get("https://leafground.com/select.xhtml");
		r.manage().window().maximize();
		
		WebElement ms = r.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete\"]/button/span[1]"));
		ms.click();
		Thread.sleep(3000);
		
		r.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li[5]")).click();
		ms.click();
		Thread.sleep(3000);
		r.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li[3]")).click();
		ms.click();
		Thread.sleep(3000);
		r.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_panel\"]/ul/li[7]")).click();
		ms.click();
		Thread.sleep(3000);
		

	}

}
