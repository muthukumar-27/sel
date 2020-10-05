package com.sel.exercise;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class itest {
	
	
	@Test(dataProvider="hell",groups="A")
	public void test1(String a,String b)
	{
		System.out.println(a+" "+b);
	}
	@Test(dataProvider="hell",groups="B")
	public void test2(String a,String b)
	{
		System.out.println(a+" "+b);
	}

	@DataProvider(name="hell")
	public Object[][] testing(ITestContext c)
	{
		
		Object[][] o=null;
		
		for(String group:c.getIncludedGroups())
		{
			
			if(group.equalsIgnoreCase("A"))
			{
				o=new Object[][] {
					{"111","111"},
					{"111","111"}};
				}
			
			else
			{
				o=new Object[][] {
					{"222","222"},
					{"333","333"}};
				
			}
		}
		
		return o;
		
	}
	
	
}
