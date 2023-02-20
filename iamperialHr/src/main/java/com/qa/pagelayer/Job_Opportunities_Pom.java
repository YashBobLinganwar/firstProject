package com.qa.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_Opportunities_Pom {
	@SuppressWarnings("unused")
	private WebDriver driver ;
	@FindBy (xpath="//strong[text()='Job Opportunities']")
	private WebElement pageTitle ;
	
	@FindBy (xpath="//div[normalize-space()='Account Manager']")
	private WebElement jobTitle ;
	
	@FindBy (xpath="//input[@id='search']")
	private WebElement jobSearchInputBox ;
	
	@FindBy (xpath="//input[@id='jobcity']")
	private WebElement cityDropDown ;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[4]/span[1]")
	private WebElement searchButton ;
	
	@FindBy (xpath="//button[text()='Apply']")
	private WebElement applyButton ;
	
	public Job_Opportunities_Pom (WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public boolean getPageTitle ()
	{
		return pageTitle.isDisplayed();
	}

	public boolean getjobTitle ()
	{
		return jobTitle.isDisplayed();
	}
	
	public void clickapplyButton ()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", applyButton);
	}
}
