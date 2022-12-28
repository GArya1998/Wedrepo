package com.TestNGProject;

import org.testng.annotations.Test;

public class DemoB {

	@Test(priority=1)
	private void openTheBrowser() {
		System.out.println("Chrome");
	}

	@Test(dependsOnMethods="openTheBrowser")
	private void enterUrl() {
		System.out.println("https://xyz.com");
	}

	@Test(priority = 3)
	private void searchPage() {
		System.out.println("Mobile");
	}
}

