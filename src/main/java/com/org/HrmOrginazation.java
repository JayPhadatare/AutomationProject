package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HrmOrginazation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		WebElement e1 = driver.findElement(By.xpath("//b[text()='Admin']"));
		//WebElement e2 = driver.findElement(By.xpath("//a[text()='Job']"));
		WebElement e3 = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement e4= driver.findElement(By.xpath("//a[text()='Structure']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(e1).moveToElement(e3).moveToElement(e4).click().build().perform();
		
		
		
		

	}

}
