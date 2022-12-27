package com.test.e2e;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	/**
	 * for Every @Test started Execution onTestStart method will Know
	 */
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}


	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart ==Your Suite Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish ==Your Suite Finish");
	}
	
}
