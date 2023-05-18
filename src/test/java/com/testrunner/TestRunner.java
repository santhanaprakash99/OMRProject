package com.testrunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@Login"),features = "src/test/resources/Features/TC1_Login.feature", glue = "com.stepdefinition", plugin = {
		"pretty", "json:target/output.json" }, dryRun = false, monochrome = true)

public class TestRunner extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {

		// String path = System.getProperty("user.dir");
		Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonpath"));
	}
}
