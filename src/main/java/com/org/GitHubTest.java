package com.org;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitHubTest {
	

		@Test
		public void github()
		{
			System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.get("https://github.com/login");
			driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("JayPhadatare");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Jayphadatare@123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}}



