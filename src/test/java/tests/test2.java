package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pageobjects.PageObjects;

public class test2 {
	


	public class firsttestngfile {

		WebDriver driver;
		//String baseUrl = "";
		
	@BeforeSuite
		public void setUp() {
		   	  String driverPath = "C:\\Users\\BharathAnandraj\\eclipse-workspace\\Training\\automation\\drivers\\chromedriver.exe";   
		      System.out.println("launching chrome browser"); 
		      System.setProperty("webdriver.chrome.driver", driverPath);
		      driver = new ChromeDriver();
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
	     
	  @Test
	  public void verifyCreateNewAccount() {
		  PageObjects obj = new PageObjects(driver);
		  obj.login("mngr383506", "zEtahYv");
		  obj.navigateToNewAccount();
		  obj.addAccount("90061");
	      
	  }
	  
	  
	  @AfterSuite
		public void tearDown() {
			driver.quit();
		}
	}

}
