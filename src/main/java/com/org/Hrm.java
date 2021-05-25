package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hrm {
	@Test
	public void rama()
	{
		
				System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();
				driver.get("https://opensource-demo.orangehrmlive.com/");
				driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
				driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[5]")).click();
				driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[5]/ul/li[2]")).click();

		}

	

}
