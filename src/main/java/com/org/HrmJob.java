package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmJob {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(dr.getCurrentUrl());
		System.out.println(dr.getTitle());
		dr.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		dr.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		dr.findElement(By.xpath("//input[@class='button']")).click();
		
		WebElement e1 = dr.findElement(By.xpath("//b[text()='Admin']"));
		WebElement e2= dr.findElement(By.xpath("//a[text()='Job']"));
		WebElement e3 = dr.findElement(By.xpath("//a[text()='Work Shifts']"));
		Actions ac= new Actions(dr);
		ac.moveToElement(e1).moveToElement(e2).moveToElement(e3).click().build().perform();
		WebElement e4 = dr.findElement(By.xpath("//input[@name='chkSelectAll']"));
		e4.click();

	}

}
