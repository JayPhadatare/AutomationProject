package com.org;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Table {
	@Test
	public void sample2()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		driver.switchTo().frame("iframeResult");
		WebElement table = driver.findElement(By.xpath("//h2[text()='HTML Table']/following::table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement>coloumns=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<coloumns.size();j++)
			{
				String name=coloumns.get(j).getText();
				if(name.equals("Giovanni Rovelli"))
				{
				System.out.println(coloumns.get(2).getText());
				}
			}
		}

}}





