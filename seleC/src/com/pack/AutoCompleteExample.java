package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
		WebElement click = driver.findElement(By.xpath("//*[@id=\'searchbox\']"));
		click.sendKeys("A");
		Thread.sleep(4000);
		
		
		List <WebElement> list = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		for (WebElement input : list) {
			if(input.getText().equals("Algeria")) {
				input.click();
				break;
				
			}
		}
	}

}
