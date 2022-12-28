package com.TestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
	@Test
	public void chromeA() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vvmvk\\eclipse-workspace\\TestNGProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void chromeB() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vvmvk\\eclipse-workspace\\TestNGProject\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
}
