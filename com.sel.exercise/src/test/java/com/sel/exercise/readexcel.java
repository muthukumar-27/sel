package com.sel.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {

	public Sheet sendexcel(String file,String work) throws IOException
	{
		File f1=new File(file);
		FileInputStream fin=new FileInputStream(file);
		Workbook w1=new XSSFWorkbook(fin);
		Sheet sh=w1.getSheet(work);
		return sh;
	}
}
