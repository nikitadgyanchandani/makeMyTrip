package com.makemytrip.TestCases;

import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.makemytrip.CommonUtilities.baseClass;
import com.makemytrip.PageObjects.HomePage;

public class HomePageTest extends baseClass{
	
	HomePage hp;
	
	@BeforeSuite
	public void baseClassNavigation() throws IOException
	{
	
		driver=initializeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		hp=new HomePage(driver);
	}
	
	@Test(priority=1)
	public void verifyLogo()
	{
		boolean logoIsDisplayed=hp.verifyLogo().isDisplayed();
		
		System.out.println("verifyLogo: ,Expected Value: true, Actual value: " + logoIsDisplayed);
		
	}
	
	@Test(priority=2)
	public void verifyLangCurrencyCountryDropdown() throws InterruptedException
	{
		hp.clickRuntimeAutoPopup().click();
		Thread.sleep(2000);
		boolean dropdownIsDisplayed=hp.verifyLangCurrencyCountry().isDisplayed();
		System.out.println("verifyLangCurrencyCountryDropdown: ,Expected Value: true, Actual value: " + dropdownIsDisplayed);
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
		hp.serachButton().click();
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}

}
