package com.qa.testbase;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	protected WebDriver driver ;
	
	@BeforeMethod
    public void shouldAnswerWithTrue()
    {
      WebDriverManager.edgedriver().setup();
      driver = new EdgeDriver();
      driver.manage().window().maximize();
      driver.get("https://imperialhr.sqftinfra.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
    }
	
	@AfterMethod
	public void tearDown ()
	{
		driver.close();
	}
}
