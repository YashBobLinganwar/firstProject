package com.qa.testlayer;
import org.testng.annotations.Test;
import com.qa.pagelayer.JobApplication_Pom;
import com.qa.pagelayer.Job_Opportunities_Pom;
import com.qa.pagelayer.homePagePOM;
import com.qa.testbase.TestBase;
import static org.assertj.core.api.Assertions.assertThat;
public class AppTest extends TestBase
{  
	
	private homePagePOM homePom ;
	private Job_Opportunities_Pom jobPom ;
	private JobApplication_Pom applicationPom ;
	
	@Test(priority=1)
	public void testHomePagePOM ()
	{
		homePom = new homePagePOM (driver);
//		String actualTitle = "Imperial HR Solutions";
//		String excepectedTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, excepectedTitle);
		assertThat(driver.getTitle()).isEqualTo("Imperial HR Solutions");
	}
	
	@Test(priority=2)
	public void testJobSearchField ()
	{
		homePom = new homePagePOM (driver);
	    jobPom = new Job_Opportunities_Pom(driver);
		homePom.sendInputJobTitleSerchBox();
		homePom.clickselectCityDropDown();
		homePom.sendInputSelectCitySerchbox();
		homePom.clickSelectCitySuggetion();
		homePom.clickSearchJobButton();
//		boolean expectedPageTitle = jobPom.getPageTitle();
//		Assert.assertTrue(expectedPageTitle);
		 assertThat(jobPom.getPageTitle()).isTrue();
	}
	@Test(priority=3)
	public void testJobSearchResult ()
	{
		homePom = new homePagePOM (driver);
	    jobPom = new Job_Opportunities_Pom(driver);
		homePom.sendInputJobTitleSerchBox();
		homePom.clickselectCityDropDown();
		homePom.sendInputSelectCitySerchbox();
		homePom.clickSelectCitySuggetion();
		homePom.clickSearchJobButton();
//		boolean expectedJobTitle = jobPom.getjobTitle();
//		Assert.assertTrue(expectedJobTitle);
		assertThat(jobPom.getjobTitle()).isTrue();
	}
	@Test(priority = 4)
	public void testJobApplictionPage ()
	{
		homePom = new homePagePOM (driver);
	    jobPom = new Job_Opportunities_Pom(driver);
	    applicationPom = new JobApplication_Pom(driver);
	    homePom.clickCookieButton();
		homePom.sendInputJobTitleSerchBox();
		homePom.clickselectCityDropDown();
		homePom.sendInputSelectCitySerchbox();
		homePom.clickSelectCitySuggetion();
		homePom.clickSearchJobButton();
		jobPom.clickapplyButton();
		assertThat(applicationPom.verifyApplicationId()).isTrue();
	}
	@Test(priority = 5)
	public void testJobApplictionFields () 
	{
		homePom = new homePagePOM (driver);
	    jobPom = new Job_Opportunities_Pom(driver);
	    applicationPom = new JobApplication_Pom(driver);
	    homePom.clickCookieButton();
		homePom.sendInputJobTitleSerchBox();
		homePom.clickselectCityDropDown();
		homePom.sendInputSelectCitySerchbox();
		homePom.clickSelectCitySuggetion();
		homePom.clickSearchJobButton();
		jobPom.clickapplyButton();
		applicationPom.verifyNameInputBox();
		applicationPom.verifyEmailInputBox();
		applicationPom.verifyMobileInputBox();
		applicationPom.verifyProvinceDropDownBox();
		applicationPom.verifyCityInputBox();
		applicationPom.verifyCurrentStatusInCanadaDropDownBox();
		applicationPom.verifyUplodResumeOption();
		applicationPom.verifyCermsCheckBox();
		applicationPom.verifySubmitButton();
		assertThat(applicationPom.VerifySuccesfullMassge()).isTrue();
		applicationPom.verifyOkButton();
		
	}
}