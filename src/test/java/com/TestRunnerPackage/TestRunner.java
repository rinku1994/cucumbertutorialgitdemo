package com.TestRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFileFolder/register.feature" }, 
        glue = { "com.StepDefination" },
		monochrome =true

)
public class TestRunner {

}
