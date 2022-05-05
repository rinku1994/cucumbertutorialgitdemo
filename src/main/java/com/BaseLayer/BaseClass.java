package com.BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	
	public static WebDriver driver;
	
	//public static void initialization() {
		public static void initialization(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.get(url);
	
		
	}

	


		
	}


