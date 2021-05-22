package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForgotPasswordTest {
	@Test
	public void forgotPassword()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.id("securityAuthentication_userName")).sendKeys("Admin");
		driver.findElement(By.id("btnCancel")).click();
	}
}
