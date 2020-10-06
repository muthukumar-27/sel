package com.sel.exercise;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng1 {

	
	
	@Test(invocationCount=4)
	public void testing1()
	{
		System.out.println("testing1");
		SoftAssert s=new SoftAssert();
		
	
		
	Assert.assertTrue(8>9, "helo");
		System.out.println("hello");
		
	}
	@Test(dependsOnMethods="testing3")
	public void testing2()
	{

		System.out.println("t");
	}
	@Test()
	public void testing3()
	{
		System.out.println("testing3");
	}
}
