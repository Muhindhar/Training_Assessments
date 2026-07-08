package com.definitions;

import com.utilities.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void setup() {
		HelperClass.setdriver();
	}
	@After
	public void teardown() {
		HelperClass.teardown();
	}

}
