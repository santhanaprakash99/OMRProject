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
@CucumberOptions(tags=("@AllF"),features = "src/test/resources/Features/TC4_BookHotel.feature", glue = "com.stepdefinition", plugin = {
		"pretty", "json:target/output.json" }, dryRun = false, monochrome = true)

public class TestRunner extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {

		Reporting.generateJvmReport(getProjectPath() + getPropertyFileValue("jsonpath"));
	}
}
