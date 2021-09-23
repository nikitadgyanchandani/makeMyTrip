package com.makemytrip.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.makemytrip.CommonUtilities.baseClass;
import com.makemytrip.PageObjects.HomePage;

public class HomePageTest extends baseClass{
	
	@Test
	public void baseClassNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		HomePage hp=new HomePage(driver);
		boolean logoIsDisplayed=hp.verifyLogo().isDisplayed();
		
		System.out.println("baseClassNavigation: ,Expected Value: true, Actual value: " + logoIsDisplayed);
		System.out.println("git commit successfully done");
		System.out.println("git commit successfully done");
				
	}

}
