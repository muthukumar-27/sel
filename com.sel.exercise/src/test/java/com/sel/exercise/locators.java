package com.sel.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class locators {
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		
		
		d.get("https://www.testandquiz.com/selenium/testing.html");
		
		JavascriptExecutor js=(JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,500)");
		
		
		WebElement from=d.findElement(By.xpath("//img[@id='sourceImage']"));
		WebElement to=d.findElement(By.xpath("//div[@id='targetDiv']"));
		
		Actions a=new Actions(d);
		
		
		a.dragAndDrop(from, to).build().perform();

	a.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		d.quit();
		
		
		
		
	}

}
