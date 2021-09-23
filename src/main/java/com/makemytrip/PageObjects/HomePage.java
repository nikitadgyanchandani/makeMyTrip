package com.makemytrip.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	

	By Logo=By.xpath("//a[contains(@class,'mmtLogo makeFlex')]");
	
	public WebElement verifyLogo()
	{
		return driver.findElement(Logo);
		
	}
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
}
