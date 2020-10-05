package com.sel.exercise;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	@Test
	@Parameters({"a","b"})
	public void test1(@Optional("hell")String a,String b)
	{
		System.out.println(a+"   "+b);
	}

}
