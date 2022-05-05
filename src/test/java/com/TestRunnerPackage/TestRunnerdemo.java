package com.TestRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class TestRunnerdemo {
@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFileFolder/demo.feature" }, 
		glue = {"com.StepDefination" }, 
		monochrome=true,
		dryRun=false
		

)
public class HomePageTestRunner {

}

}

