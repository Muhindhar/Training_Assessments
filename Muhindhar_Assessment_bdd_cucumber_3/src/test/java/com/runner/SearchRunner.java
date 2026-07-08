package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.definitions", 
plugin = { "pretty",
		"html:reports/Cucumber.html", 
		"json:reports/Cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true)
public class SearchRunner extends AbstractTestNGCucumberTests {

}
