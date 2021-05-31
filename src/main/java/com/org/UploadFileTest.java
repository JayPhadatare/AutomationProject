package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UploadFileTest {
	@Test()
	public void file()

 {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
			driver.get("https://tus.io/demo.html");
			driver.manage().window().maximize();
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			Actions a=new Actions(driver);
			WebElement button = driver.findElement(By.xpath("//input[@id='js-file-input']"));
		    button.sendKeys("D:\\jay.txt");
			
	}



}
