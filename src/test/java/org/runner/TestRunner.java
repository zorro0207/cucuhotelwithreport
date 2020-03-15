package org.runner;

import org.base.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"}, glue= "org.stepdef", plugin= {"json:src\\test\\resources\\Reporting\\cucumber.json"}, monochrome= true)

public class TestRunner {
	@AfterClass
	public static void afterclass() {
		JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\cucumber.json");

	}

}
