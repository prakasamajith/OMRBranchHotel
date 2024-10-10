package com.omrbranch.runnerclass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@Search"), dryRun = !true, plugin = { "pretty",
		"json:target//output.json" }, stepNotifications = true, snippets = SnippetType.CAMELCASE,
		features = "src\\test\\resources",
		glue = {"com.omrbranch.stepdefinition" })

public class TestRunner extends BaseClass {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJVMReport(getProjectPath() + "\\target\\output.json");
	}
}
