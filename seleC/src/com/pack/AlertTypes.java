package com.pack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTypes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver a =  new ChromeDriver();
		a.get("https://www.leafground.com/alert.xhtml;jsessionid=node01bpemckcvypcgh07hsjvtvwu2327010.node0");
		a.manage().window().maximize();
		
		WebElement salert = a.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		salert.click();
		Thread.sleep(5000);
		
		Alert alt = a.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(5000);
		
		WebElement calert = a.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		calert.click();
		Thread.sleep(5000);
		a.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		WebElement pa = a.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		pa.click();
		
		WebDriverWait wait = new WebDriverWait(a,Duration.ofSeconds(15));
		Alert alt2 = wait.until(ExpectedConditions.alertIsPresent());
		
		alt2 = a.switchTo().alert();
		alt2.sendKeys("Melody");
		Thread.sleep(5000);
		alt2.accept();
		
		Thread.sleep(5000);
		
		WebElement la = a.findElement(By.xpath("//*[@id=\"j_idt88:j_idt106\"]/span[2]"));
		la.click();

		
		Alert alt3 = a.switchTo().alert();
		Thread.sleep(5000);
		alt3.dismiss();
		Thread.sleep(5000);
		
		
	}

}
