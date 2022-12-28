package com.TestNGProject;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoD {

	@Parameters("name")
	@Test
	private void userName(@Optional("Arav") String name) {
	
		System.out.println("Username "+name);
	}

	@Parameters("number")
	@Test
	private void Password(@Optional("1432022") int number) {

		System.out.println("password " +number);
	}
}
