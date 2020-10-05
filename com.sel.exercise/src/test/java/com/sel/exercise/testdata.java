package com.sel.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testdata {

	
	public static void main(String a[]) throws IOException
	{
		
	//	FileInputStream fin=new FileInputStream(f);
		
		
		
		Workbook w=new XSSFWorkbook();
		Sheet sh=w.createSheet("test");
		
		sh.createRow(0);
		sh.createRow(1);
		
		for(int i=0;i<sh.getLastRowNum()+1;i++)
		{
			Row r=sh.createRow(i);
			for(int j=0;j<2;j++)
			{
				Cell c=r.createCell(j);
				c.setCellValue("hello");
			}
		}
		
		File f=new File("D:\\test_data\\test\\test2.xlsx");
		FileOutputStream fout=new FileOutputStream(f);
		
		w.write(fout);
		
		
		
		
		
		
	}
}
