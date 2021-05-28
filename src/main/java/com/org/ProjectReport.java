package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ProjectReport {
	@Test
	public void sample1()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click();
		WebElement index=driver.findElement(By.xpath("//a[@id='menu_time_Reports']"));
		index.click();
		WebElement ProjectReport=driver.findElement(By.xpath("//a[@id='menu_time_displayProjectReportCriteria']"));
		ProjectReport.click();
		
		

}}



