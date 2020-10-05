package com.sel.exercise;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class exce {

	WebDriver d;
	@BeforeClass
	public void intital()
	{
		d=null;
	}
	
	@Test(dataProvider="test1")
	public void testing(String c,String k,String on,String ot,String v) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		if(c.length()>0)
		{
			d=new ChromeDriver();
			System.out.println(c);
		}
		readobj ro=new readobj();
		Properties p=ro.sendobj();
		
		uioperations u=new uioperations(d);
		u.perform(p, k, on, ot, v);
		
		
		
	}
	
	
	@DataProvider(name="test1")
	public Object[][] sendigdata() throws IOException
	{
		
	readexcel r=new readexcel();
	Sheet sh=r.sendexcel("D:\\test_data\\exceldata\\t.xlsx","mk");
	
	int n=sh.getLastRowNum()-sh.getFirstRowNum();
	Object[][] o=new Object[n][5];
	
	for(int i=0;i<n;i++)
	{
		Row row=sh.getRow(i+1);
		for(int j=0;j<row.getLastCellNum();j++)
		{
			Cell c=row.getCell(j);
			o[i][j]=c.toString();
		}
	}
	
	return o;
		
	}
	
	
	
	
}
