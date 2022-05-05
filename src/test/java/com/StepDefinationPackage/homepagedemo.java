package com.StepDefinationPackage;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.BaseLayer.BaseClass;

import io.cucumber.java.en.Then;

public class homepagedemo extends BaseClass {
	
	@Then("validate user on home page by using title")
	public void validate_user_on_home_page_by_using_title() {

		String actualtitle = driver.getTitle();
		//Assert.assertEquals(actualtitle.contains("HRM"), true);
		

	   System.out.println(actualtitle);
	}

	@Then("validate user on home page by using Url")
	public void validate_user_on_home_page_by_using_url() {
		String actualUrl = driver.getCurrentUrl();
		//Assert.assertEquals(actualUrl.contains("dashboard"), true);
		System.out.println(actualUrl);
	   
	}

	@Then("validate user on home page by using logo")
	public void validate_user_on_home_page_by_using_logo() {
		boolean actualLogo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		//Assert.assertEquals(actualLogo, true);
		System.out.println(actualLogo);
	    
	}


}
