package com.sel.exercise;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	
	public void onStart(ITestContext c) {
		System.out.println("on start");
	}
	public void onFinish(ITestContext c) {
		System.out.println("on finish");
	}
	public void onTestStart(ITestResult r) {
		System.out.println("on test start");
	}
	public void onTestSuccess(ITestResult r) {
		System.out.println("on test success");
	}
	public void onTestFailure(ITestResult r) {
		System.out.println("on test failure");
	}
	public void onTestSkipped(ITestResult r) {
		System.out.println("on test skipped");
	}

}
