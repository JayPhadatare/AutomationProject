package com.org;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkedInPageTest{
	public static String parent;
	public static String child;
	public static Set<String> all;
	public static Iterator<String> i;
	public static WebDriver driver;
	
	@Test
	public void linkedin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement Link = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		Link.click();
	    all = driver.getWindowHandles();
		i=all.iterator();
		while(i.hasNext())
		{
			 child=i.next();
			 if(!parent.equals(child))
				{
					driver.switchTo().window(child);
				}
		}
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(10000);
				
		      WebElement email = driver.findElement(By.xpath("//input[@name='email-or-phone']"));
		//email.click();
		email.sendKeys("jayphadatare96@gmail.com");
		
		}}
	
	



