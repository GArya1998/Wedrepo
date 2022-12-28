package com.TestNGProject;

import org.testng.annotations.Test;

public class DemoE {
	@Test(expectedExceptions = ArithmeticException.class)
	private void openBrowser() {
		System.out.println(10 / 0);
	}
}
