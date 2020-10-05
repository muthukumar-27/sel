package com.sel.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise {

	
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		
		
			d.get("https://www.testandquiz.com/selenium/testing.html");
			
			Select s=new Select(d.findElement(By.id("testingDropdown")));
			
			s.selectByIndex(2);
			
			d.quit();
	
			
			
			
	}
}
