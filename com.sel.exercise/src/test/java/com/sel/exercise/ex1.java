package com.sel.exercise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ex1 {

	
	
	
	public static void main(String arg[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
		
		
			d.get("https://www.testandquiz.com/selenium/testing.html");
			
			
			/*
			d.findElement(By.xpath("//button[starts-with(@onclick,'alert')]")).click();
			Alert a=d.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			
			
			
			
			
			
			JavascriptExecutor js =(JavascriptExecutor)d;
			
			js.executeScript("window.scrollBy(0,2200)");
			
			String main=d.getWindowHandle();
			
			d.switchTo().frame("a077aa5e");
			
			
			d.findElement(By.xpath("//img[starts-with(@src,'Jmeter')]")).click();
			
			
			
			Set<String> s=d.getWindowHandles();
			Iterator<String> it=s.iterator();
			while(it.hasNext())
			{
				String c=it.next();
				if(!c.equalsIgnoreCase(main))
				{
					d.switchTo().window(c);
					d.close();
				}
			}
			d.switchTo().window(main);
			
			
			d.findElement(By.id("philadelphia-field-email")).sendKeys("hello muthu");
			
			
			
			d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
			*/
			Actions a=new Actions(d);
			a.doubleClick(d.findElement(By.id("dblClkBtn"))).build().perform();
			
			
			
			
			
	}
}
