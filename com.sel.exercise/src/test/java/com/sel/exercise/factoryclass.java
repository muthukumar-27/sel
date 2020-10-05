package com.sel.exercise;

import org.testng.annotations.Factory;

public class factoryclass {

	
	
	@Factory()
	public Object[] fact() {
		Object[] o=new Object[2];
		o[0]=new testng1();
		
		
		o[1]=new testing2();
		
		
		return o;
	}
}
