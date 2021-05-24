package com.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintUsenamePass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
		username.sendKeys("Admin");
		//System.out.println(username.getText());
		//System.out.println(username);
		username.clear();
		
		//driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		WebElement password= driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("admin123");
		System.out.println(password.getText());
		
	}

}
