package com.TestNGProject;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DemoA {

	@Test
	public void StuName() {

		System.out.println("Arav");
	}

	@Test(invocationCount = 4)
	private void stuId() {

		System.out.println("Student ID isTHI210");
	}

	@Ignore
	@Test
	private void stuLoc() {

		System.out.println("Chennai");
	}

	@Test(enabled = false)
	private void stuAddress() {

		System.out.println("XYZ bdf");
	}

}
