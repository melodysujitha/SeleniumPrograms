package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver dy = new ChromeDriver();
		dy.get("https://www.demo.guru99.com/test/web-table-element.php");
		dy.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> col = dy.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));//*[@id="leftcontainer"]/table/thead/tr/th
	    System.out.println("No of coloumns are: "+col.size());
	    
	    List<WebElement> row = dy.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
	    System.out.println("No of rows are: "+row.size());
	    
	    for(int i=1; i<=row.size(); i++) {
	    	dy.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + i + "]/td/a")).click();
            Thread.sleep(2000);
	    	dy.navigate().back();
	    }
	    
	    int arritr[] = {4,6,13,22,24};
	    for(int itr:arritr) {
	    	dy.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + itr + "]/td/a")).click();
            Thread.sleep(2000);
	    	dy.navigate().back();
	    }
	    		    
	    
	}

}
