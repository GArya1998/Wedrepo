package com.TestNGProject;

import org.testng.annotations.Test;

public class SampleRetry {

	@Test(retryAnalyzer = MyRetry.class)
	private void SampleTestA() {
		System.out.println(10 / 10);
	}

	@Test(retryAnalyzer = MyRetry.class)
	private void SampleTestB() {
		System.out.println(10 / 5);
	}

}
