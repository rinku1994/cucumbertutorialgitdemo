package com.StepDefinationPackage;

import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoforallscenario extends BaseClass {
	

@When("user test google title")
public void user_test_google_title() {
	BaseClass.initialization("https://www.google.com");
	String a = driver.getTitle();
	System.out.println(a);
}

@Then("user test facebook title")
public void user_test_facebook_title() {
	
	BaseClass.initialization("https://www.facebook.com/");
	String b = driver.getTitle();
	System.out.println(b);
 
}

@Then("user test logo")
public void user_test_logo() {
	
	BaseClass.initialization("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	boolean c = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	System.out.println(c);
   
}



}
