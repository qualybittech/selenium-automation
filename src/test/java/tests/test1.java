package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageobjects.PageObjects;

public class test1 {
	


	public class firsttestngfile {

		WebDriver driver;
		
	@BeforeSuite
		public void setUp() {
		   	  String driverPath = "C:\\Users\\BharathAnandraj\\eclipse-workspace\\Training\\automation\\drivers\\chromedriver.exe";   
		      System.out.println("launching chrome browser"); 
		      System.setProperty("webdriver.chrome.driver", driverPath);
		      driver = new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	     
	  @Test
	  public void verifyCreateNewCustomer() {
		  PageObjects obj = new PageObjects(driver);
		  obj.login("mngr383506", "zEtahYv");
		  obj.navigateToLink("New Customer");
		  obj.createNewCustomer();
		  obj.verifyNewCusomter();
	      
	  }
	  
	  
	  @AfterSuite
		public void tearDown() {
			driver.quit();
		}
	}

}
