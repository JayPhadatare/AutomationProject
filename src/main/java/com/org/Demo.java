package com.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void Jay()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions a=new Actions(driver);
		WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		//a.clickAndHold(Drag).moveToElement(Drop).release().build().perform();
		//a.dragAndDrop(Drag, Drop).build().perform();
		a.click(Drag).clickAndHold().moveToElement(Drop).release().build().perform();
}

}
