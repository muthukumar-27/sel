package com.sel.exercise;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uioperations {
	WebDriver d;
	uioperations(WebDriver d)
	{
		this.d=d;
	}
	
	public void perform(Properties p,String k,String on,String ot,String v)
	{
		
		switch(k.toUpperCase())
		{
		case "GOTOURL":
			d.get(p.getProperty(on));
			break;
			
		case "SEARCH":
			d.findElement(this.test1(on,ot,p)).sendKeys(v);
			break;
			
		case "CLICK":
			d.findElement(this.test1(on,ot,p)).click();
			d.quit(); 
			
			break;
		}
	}
	public By test1(String on,String ot,Properties p) {
		
		if(ot.equalsIgnoreCase("XPATH"))
		{
			return By.xpath(p.getProperty(on));
		}
		else
		{
			return By.name(p.getProperty(on));
		}
	}

}
