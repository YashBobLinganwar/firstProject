package com.qa.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class homePagePOM 
{
	 WebDriver driver ;
	
	@FindBy (xpath="//input[@placeholder='Job Title Skills or Keyword']")
	private WebElement jobTitleSerchBox;
	
	@FindBy (xpath="//span[@class='select2-selection__placeholder']")
	private WebElement selectCityDropDown;
	
	@FindBy (xpath="//input[@role='searchbox']")
	private WebElement selectCitySerchbox;
	
	@FindBy (xpath="//li[text()='Winnipeg']")
	private WebElement selectCitySuggetion;
	
	@FindBy (xpath="//button[normalize-space()='Search Job']")
	private WebElement searchJobButton;
	
	@FindBy (xpath="//a[@class='cookie-btn']")
	private WebElement cookieButton;
	
	public homePagePOM (WebDriver driver){
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	public void clickCookieButton ()
	{
		cookieButton.click();
	}
	
	public void sendInputJobTitleSerchBox ()
	{
		jobTitleSerchBox.sendKeys("account manager");
	}
	
	public void clickselectCityDropDown ()
	{
		selectCityDropDown.click();
	}
	
	public void sendInputSelectCitySerchbox ()
	{
		selectCitySerchbox.sendKeys("Winnipeg");
	}
	
	public void clickSelectCitySuggetion ()
	{
		selectCitySuggetion.click();
	}
	
	public void clickSearchJobButton ()
	{
		searchJobButton.click();
	}






}
