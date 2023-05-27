package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass extends BaseClass {

	@Before
	public void beforeClasss() throws FileNotFoundException, IOException {

		getDriver(getPropertyFileValue("browser"));
		launchUrl(getPropertyFileValue("url"));
		//maximizeWindow();
		implicitWait();
	}

	@After
	public void afterClass() {

	//	quitBrowser();
	}

}
