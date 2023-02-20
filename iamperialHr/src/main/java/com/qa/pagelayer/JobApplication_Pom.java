package com.qa.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JobApplication_Pom {
	
	 WebDriver driver;
	
	@FindBy(xpath="//h4[text()='JOBID:AM-221110006']")
	private WebElement applicationId ;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement nameInputBox ;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailInputBox ;
	
	@FindBy(xpath="//input[@name='mob']")
	private WebElement mobileInputBox ;
	
	@FindBy(xpath="//select[@id='provience_id']")
	private WebElement provinceDropDownBox;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityInputBox ;
	
	@FindBy(xpath="//select[@id='canadian_status']")
	private WebElement currentStatusInCanadaDropDownBox ;

	@FindBy(xpath="//input[@type='file']")
	private WebElement uplodResumeOption ;
	
	@FindBy(xpath="//input[@name='terms']")
	private WebElement termsCheckBox ;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement submitButton ;
	
	@FindBy(xpath="//h2[text()='Done!']")
	private WebElement succesfullMassge ;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okButton ;
	
	public JobApplication_Pom (WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyApplicationId ()
	{
		return applicationId.isDisplayed();
	}
	
	public void verifyNameInputBox()
	{
		nameInputBox.sendKeys("Demo");
	}
	
	public void verifyEmailInputBox ()
	{
		emailInputBox.sendKeys("Demo@123.com");
	}
	public void verifyMobileInputBox ()
	{
		mobileInputBox.sendKeys("1234567890");
	}
	public void verifyProvinceDropDownBox ()
	{
		Select select = new Select(provinceDropDownBox);
		select.selectByVisibleText("Alberta");
	}
	public void verifyCityInputBox ()
	{
		cityInputBox.sendKeys("Medicine Hat");
	}
	public void verifyCurrentStatusInCanadaDropDownBox ()
	{
		Select select = new Select (currentStatusInCanadaDropDownBox);
		select.selectByIndex(1);
	}
	public void verifyUplodResumeOption ()
	{
		uplodResumeOption.sendKeys("D:\\Downloads\\Testing Nots\\Real Time Interview Questions(Manual,Java).pdf");
	}
	public void verifyCermsCheckBox ()
	{
		termsCheckBox.click();
	}
	public void verifySubmitButton ()
	{
		submitButton.click();
	}
	public boolean VerifySuccesfullMassge ()
	{
		return succesfullMassge.isDisplayed();
	}
	public void verifyOkButton ()
	{
		okButton.click();
	}
	
}
