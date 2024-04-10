package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver wb = new ChromeDriver();
		wb.get("https://www.leafground.com/table.xhtml;jsessionid=node01s4dhc2z9e3el97kdcm21vq1q148871.node0");
		wb.manage().window().maximize();
		Thread.sleep(2000);
		
	/*	List<WebElement> tall = wb.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement td : tall)
		{
			String TableTxt = td.getText();
			System.out.println(TableTxt);
		}
		
		System.out.println();*/
		
		List<WebElement> tr = wb.findElements(By.xpath("//table/tbody/tr[6]/td[1]"));
		
		for(WebElement tabrow : tr)
		{
			String TableText = tabrow.getText();
			System.out.print(TableText+" ");
		}
		
		
	}

}
