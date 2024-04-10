package com.pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.leafground.com/window.xhtml");
		String parentWindow = d.getWindowHandle();
		System.out.println(parentWindow);
		Thread.sleep(20000);

		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		Thread.sleep(6000);
		
		Set<String> childWindow = d.getWindowHandles();

		for (String ch : childWindow) {
			d.switchTo().window(ch);
			// Alert xpath
			d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
			Thread.sleep(6000);
			d.switchTo().alert().accept();
			Thread.sleep(6000);
			d.close();
			Thread.sleep(6000);
		}
		d.switchTo().window(parentWindow);

		d.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();

		int wsize = d.getWindowHandles().size();
		System.out.println(wsize);

		Set<String> multiwindow = d.getWindowHandles();

		for (String cwindow : multiwindow) {
			if (!cwindow.equals(parentWindow)) {
				d.switchTo().window(cwindow);
				d.close();
			}
		}
	}

}