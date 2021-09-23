package com.makemytrip.TestCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.makemytrip.CommonUtilities.baseClass;
import com.makemytrip.PageObjects.HomePage;

public class HomePageTest extends baseClass{
	
	HomePage hp=new HomePage(driver);
	
	@BeforeMethod
	public void baseClassNavigation() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();			
	}
	
	@Test(priority=1)
	public void verifyLogo()
	{
		boolean logoIsDisplayed=hp.verifyLogo().isDisplayed();
		
		System.out.println("verifyLogo: ,Expected Value: true, Actual value: " + logoIsDisplayed);
		
	}
	
	@Test(priority=2)
	public void verifyLangCurrencyCountryDropdown()
	{
		
		boolean dropdownIsDisplayed=hp.verifyLangCurrencyCountry().isDisplayed();
		System.out.println(dropdownIsDisplayed);
		hp.verifyLangCurrencyCountry().click();
		
	}
	
	/*@Test
	public void verifyCountryList()
	{
		
		hp.verifyCountryList();
	}*/
	
	@Test(priority=3)
	public void  verifySearchButton()
	{

		boolean buttonIsDisplayed=hp.serachButton().isDisplayed();
		System.out.println("verifySearchButton: ,Expected Value: true, Actual value: " + buttonIsDisplayed);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
