package com.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started\n");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {    // test pass
		
		System.out.println("sucessfully executed");
	}

	@Override
	public void onTestFailure(ITestResult result) {    // whenever test fail this method execute
		
		// screenshot code here
		System.out.println("Test Failed " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
