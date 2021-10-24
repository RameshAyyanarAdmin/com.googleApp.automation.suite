package com.googleApp.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.googleApp.driver.Driver;
import com.googleApp.driver.DriverManager;
import com.googleApp.reports.Logger;
//import com.relevantcodes.extentreports.ExtentTest;

public class HomePage {

	@FindBy(xpath=".//img[@alt='Google']")
	WebElement homePageLogo;
	
	@FindBy(xpath=".//input[@name='q']")
	WebElement searchBox;
	
	public HomePage(){
		PageFactory.initElements(DriverManager.getDriver(),this);	
	}
	
	public void homePageTitleValidation() {
		Logger.logINFO("Verifying the homepage Logo");
		Assert.assertTrue(homePageLogo.isDisplayed(),"Home page Logo is not displayed");
	}
	
	public void searchBoxValidation() {
		Logger.logINFO("Verifying the search box validation");
		searchBox.sendKeys("Selenium");
	}
}