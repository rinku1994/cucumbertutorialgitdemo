package com.StepDefinationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginpagedemo extends BaseClass {
  
	
	@Given("user is on present on login page")
	public void user_is_on_present_on_login_page() {
		//BaseClass.initialization();
		

	}

	

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

	}

	@Then("user is on home page of application")
	public void user_is_on_home_page_of_application() {
		
			System.out.println(driver.getTitle());
	}

}
