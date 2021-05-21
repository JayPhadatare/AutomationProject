package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HrmLoginPage {
	public  WebDriver driver;
	@Test
	public void logindetails() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//div[@id='welcome-menu']/ul/li[3]/a")).click();
	}
	@AfterTest
	public void logindetailsdelete()
	{
		driver.close();
		driver.quit();
	}

}
