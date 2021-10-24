package com.googleApp.test;

import org.testng.annotations.*;
import com.googleApp.driver.Driver;
import com.googleApp.reports.ExtentReportManager;
import com.googleApp.reports.Logger;
import com.googleApp.pages.HomePage;
import com.googleApp.utilities.ConfigReader;

public class TestClass extends InitializeTest {

	HomePage homePage;
	
	@Test
	public void testCase1() {
		try {
		ExtentReportManager.setExtentTest(ExtentReportManager.report.startTest("Verify the homepage link"));
		Driver.initialize(ConfigReader.get("autURL"));
		Logger.logPASS("Browser launched successfully");			
		homePage=new HomePage();
		homePage.homePageTitleValidation();	
		Logger.logPASS("Validated home page title successfully");
		}
		catch(Exception e) {
			Logger.logFAIL("home page title validation failed");
			e.printStackTrace();
		}
	}

	@Test
	public void testCase2() {
		try {
		ExtentReportManager.setExtentTest(ExtentReportManager.report.startTest("TestCase 2"));
		Driver.initialize(ConfigReader.get("autURL"));
		Logger.logPASS("Browser launched successfully");
		homePage=new HomePage();
		homePage.searchBoxValidation();
		Logger.logPASS("Validated search box functionality successfully");
		}
		catch(Exception e) {
			Logger.logFAIL("search box functionality failed");
			e.printStackTrace();
		}
	}

}