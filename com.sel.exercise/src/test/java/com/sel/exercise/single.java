package com.sel.exercise;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class single {
	
	@Test(dataProvider="hello")
	public void test1(String a,String b)
	{
		System.out.println(a+"  "+b);
	}
	@Test(dataProvider="hello")
	public void test2(String a,String b)
	{
		System.out.println(a+"  "+b);
	}
	
	
	@DataProvider(name="hello")
	public Object[][]send(Method m)
	{
		if(m.getName().equalsIgnoreCase("test1")) {
		return new Object[][]{
			{"hello","test"},
			{"heloo1","wrw"}
			
		};
	}
		else
			return new Object[][]{
			{"hello22","test"},
			{"heloo2221","wrw"}
			
		};
	
	
	}

}
