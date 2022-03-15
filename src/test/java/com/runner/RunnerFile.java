package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { // report
			"html:target/report/cucumber.html", "json:target/cucumber.json"

	},

			features = { ".//Features/" }, // path
			glue = { "com.stepdef" },// stepdef package name

	monochrome=true,
	tags= {"@Smoke"}
	)

	public class RunnerFile extends AbstractTestNGCucumberTests {

	}
