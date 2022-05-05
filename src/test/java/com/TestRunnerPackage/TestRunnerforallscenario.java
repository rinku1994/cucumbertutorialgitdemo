package com.TestRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunnerforallscenario {

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFileFolder/allscenario.feature" }, 
		glue = {"com.StepDefination" }, 
		monochrome = true, 
		dryRun = false, 
		tags =  "not @orangehrm"  

)
public class TestRunner {

}

}
