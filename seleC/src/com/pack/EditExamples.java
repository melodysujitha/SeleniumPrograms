package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/input.xhtml");
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\'j_idt88:name\']"));
		textbox.sendKeys("Melody Sujitha");
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
		append.sendKeys("added text");
		
		WebElement enable = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt93\']"));
		boolean status = enable.isEnabled();
		System.out.println(status);
		
		WebElement cleartext = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']"));
		cleartext.clear();
		
		WebElement text = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt97\']"));
		String content = text.getAttribute("value");
		System.out.println(content);
	}

}
