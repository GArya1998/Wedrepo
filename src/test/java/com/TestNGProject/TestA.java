package com.TestNGProject;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA {

	@Parameters("name")
	@Test
	private void userName(String name) {
	
		System.out.println("Username " +name);
	}

	@Parameters("number")
	@Test
	private void Password(int number) {

		System.out.println("password " +number);
	}
}
