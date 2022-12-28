package com.TestNGProject;

import org.testng.annotations.Test;

public class DemoC {

	@Test(groups = "Black")
	private void TeamA() {
		System.out.println("TeamA");
	}

	@Test(groups = "Black")
	private void TeamAA() {
		System.out.println("TeamAA");
	}

	@Test(groups = "Black")
	private void TeamAB() {
		System.out.println("TeamAB");
	}

	@Test(groups = "Black")
	private void TeamAC() {
		System.out.println("TeamAC");
	}

	@Test(groups = "RED", dependsOnGroups = "Black")
	private void TeamB() {
		System.out.println("TeamB");
	}

	@Test(groups = "RED")
	private void TeamBA() {
		System.out.println("TeamBA");
	}

	@Test(groups = "RED")
	private void TeamBB() {
		System.out.println("TeamBB");
	}

	@Test(groups = "RED")
	private void TeamBC() {
		System.out.println("TeamBC");
	}

	@Test(groups = "RED")
	private void TeamBD() {
		System.out.println("TeamBD");
	}
}
