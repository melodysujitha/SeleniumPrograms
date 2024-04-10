package com.pack;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver f =  new ChromeDriver();
		f.get("http://brm.tremplintech.in/web_pages/login.aspx");
		f.manage().window().maximize();
		
		f.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		f.findElement(By.cssSelector("#txt_pass")).sendKeys("admin");
		f.findElement(By.name("Button3")).click();
		
		f.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
		
		Select state = new Select(f.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_state\"]")));
		state.selectByIndex(6);
		Thread.sleep(3000);
		state.selectByValue("Tamil Nadu");
		Thread.sleep(3000);
		state.selectByVisibleText("Jammu & Kashmir");
		Thread.sleep(3000);
		
		

	}

}
