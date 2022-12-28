package com.TestNGProject;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDemo {
	@Test(dataProvider = "My Data")
	private void userData(String username, String password) {
		System.out.println("UserName " + username);
		System.out.println("Password " + password);

	}

	@DataProvider(name = "My Data")
	private Object[][] myData() {
		return new Object[][] { { "abc", "123" }, { "bcd", "321" }, { "cdf", "456" } };
	}

	@DataProvider(name = "Client Data")
	private Object[][] clientData() {
		return new Object[][] { { "client A", "13535623" }, { "Client B", "325453251" }, { "Client C", "435356" },{ "Client D", "447878535356" }  };
	}
}
