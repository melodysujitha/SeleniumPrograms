package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");
        
        WebElement field = driver.findElement(By.xpath("//*[@id=\'firstname\']"));
        String tip = field.getAttribute("title");
        System.out.println(tip);
        
        
        
	}

}
