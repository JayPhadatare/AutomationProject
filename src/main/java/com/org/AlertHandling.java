package com.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	@Test
	public  void jay() 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement button = driver.findElement(By.xpath("//button[text()='Generate Alert Box']"));
		button.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		WebElement button1 = driver.findElement(By.xpath("//button[text()='Generate Confirm Box']"));
		button1.click();
	    a.accept();
	}


}
