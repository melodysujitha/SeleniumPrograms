package com.pack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException, FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver dr =  new ChromeDriver();
		dr.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		dr.manage().window().maximize();
		
		FileInputStream f = new FileInputStream("D:\\Example\\file1.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int rowcount = s.getRows();
		
		for(int i=1; i<rowcount; i++) {
			String username = s.getCell(0,i).getContents();
			String password = s.getCell(1,i).getContents();
			
			dr.findElement(By.xpath("//input[@id='txt_unam']")).sendKeys(username);
			dr.findElement(By.xpath("//input[@id='txt_pass']")).sendKeys(password);
			dr.findElement(By.xpath("//input[@id='Button3']")).click();
			Thread.sleep(5000);
			dr.findElement(By.xpath("//a[@id='LinkButton1']")).click();
			
		}
		

	}

}
