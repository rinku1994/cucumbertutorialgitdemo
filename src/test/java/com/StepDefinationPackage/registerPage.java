package com.StepDefinationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerPage {
	
	WebDriver driver;
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\dell\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
	}
	   
	
	@When("user enter first name and last name,")
	public void user_enter_first_name_and_last_name() {
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("xyz");
	  
	}
	@When("user enter password and select Dob")
	public void user_enter_password_and_select_dob() {
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@12345");
		WebElement day=driver.findElement(By.id("day"));
		Select selday=new Select(day);
		selday.selectByVisibleText("10");
		
	   
	}
	@Then("account is sucessful created")
	public void account_is_sucessful_created() {
		System.out.println(driver.getTitle());
	    
	}



}
