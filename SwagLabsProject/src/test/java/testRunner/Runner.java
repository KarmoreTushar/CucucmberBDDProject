package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { ".\\src\\test\\resources\\features" }, // feature file or folder name
		glue = { "stepDefinitions" }, dryRun = false,
//		tags = ( "@Smoke, @Regression" ),
//		tags = ( "@Smoke and @Regression" ), run those scenario which is part of sanity as and regression tag
//		tags = ( "@Smoke and not @Regression" ), run those scenario which is part of sanity but not of regression tag
//		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
//		plugin = {"pretty","html:target/cucumber-reports/reports1.html" },
		plugin = { "pretty", "json:target/cucumber-reports/reports_json.json" }, 
//		plugin = { "pretty", "junit:target/cucumber-reports/reports2_xml.xml" }, 
		monochrome = true, publish = true
		)
		
public class Runner extends AbstractTestNGCucumberTests {
//This class will be empty
}