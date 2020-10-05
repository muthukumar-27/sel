package com.sel.exercise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.sel.exercise.Listener.class)
public class testing2 {

	
	
	@Test(invocationCount=4)
	public void testing1()
	{
		System.out.println("hello");
	}

}
