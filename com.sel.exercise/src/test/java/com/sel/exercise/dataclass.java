package com.sel.exercise;

import org.testng.annotations.DataProvider;

public class dataclass {

	@DataProvider(name="hello")
	public Object[][]send()
	{
		return new Object[][]{
			{"hello","test"},
			{"heloo1","wrw"}
			
		};
	}
}
