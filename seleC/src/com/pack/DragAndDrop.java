package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'form:drag_content\']/p"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'form:drop_content\']/p"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		
		//action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
	}

}
