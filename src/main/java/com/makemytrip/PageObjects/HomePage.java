package com.makemytrip.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public WebDriver driver;
	

	By Logo=By.xpath("//a[contains(@class,'mmtLogo makeFlex')]");
	By langCurrencyDropdown=By.xpath("//span[contains(@class,'switcherDownArrow')]");
	By searchButton=By.xpath("//a[text()='Search']");
	By country=By.xpath("//div[@class='searchListWrap']/p");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement verifyLogo()
	{
		return driver.findElement(Logo);
		
	}
	public WebElement verifyLangCurrencyCountry()
	{
		return driver.findElement(langCurrencyDropdown);
		
	}
	/*public void verifyCountryList()
	{
		Select dropdown = new Select(country);

	    //Get all options
	    List<WebElement> dd = dropdown.getOptions();
	    for (int j = 0; j < dd.size(); j++) 
	    {
	        System.out.println(dd.get(j).getText());
	    }
		//return dd;
*/	
	
	public WebElement serachButton()
	{
		return driver.findElement(searchButton);
	}
	
	}
	

