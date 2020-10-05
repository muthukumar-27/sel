package com.sel.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readobj {

	
	Properties p=new Properties();
	
	public Properties sendobj() throws IOException
	{
		FileInputStream fin=new FileInputStream(new File("D:\\eclipse\\com.sel.exercise\\src\\test\\java\\com\\sel\\exercise\\object.properties"));
	p.load(fin);
	return p;
		
		
	}
	
	
}
