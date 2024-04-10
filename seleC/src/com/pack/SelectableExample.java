package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");
		
		List <WebElement> list = driver.findElements(By.xpath("//*[@id=\'nav-home\']/ul/li"));
		
		/*Actions action = new Actions(driver);
		action.clickAndHold(list.get(0));
		action.clickAndHold(list.get(1));
		action.clickAndHold(list.get(2));
		action.build().perform();
		Thread.sleep(1000);*/
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		action.click(list.get(0))
		.click(list.get(1))
		.click(list.get(2)).build().perform();
		
		
		
	}

}
