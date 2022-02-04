package pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
		
		private WebDriver driver;
		
		public PageObjects(WebDriver driver) {
			
			this.driver = driver;
			driver.get("https://demo.guru99.com/V4");
		}
				
		public void login(String username, String password) {
			
			driver.findElement(By.name("uid")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("btnLogin")).click();
			
		}
		
		public void navigateToLink(String linkText) {
			
			driver.findElement(By.linkText(linkText)).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
		
		public void navigateToNewAccount() {
			
			driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
	
		public void createNewCustomer() {
			
			driver.findElement(By.name("name")).sendKeys("John");
			driver.findElement(By.name("rad1")).click();
			driver.findElement(By.name("dob")).sendKeys("20-01-1984");
			driver.findElement(By.name("addr")).sendKeys("Address");
			driver.findElement(By.name("city")).sendKeys("city");
			driver.findElement(By.name("state")).sendKeys("state");
			driver.findElement(By.name("pinno")).sendKeys("123456");
			driver.findElement(By.name("telephoneno")).sendKeys("123456789");
			Random random = new Random();   
			// Generates random integers 0 to 49  
			int x = random.nextInt(50);   
			driver.findElement(By.name("emailid")).sendKeys("emailid"+x+"@gmail.com");
			driver.findElement(By.name("password")).sendKeys("password");
			driver.findElement(By.name("sub")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			
		}
		
		public String verifyNewCusomter() {
			
			String custMessageActual = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[1]/td/p")).getText();
			assertEquals(custMessageActual, "Customer Registered Successfully!!!");
			String customerNumber = driver.findElement(By.xpath("//*[@id='customer']/tbody/tr[4]/td[2]")).getText();
			return customerNumber;
			
		}
		
		public void addAccount(String CustomerNumber) {
			
			driver.findElement(By.name("cusid")).sendKeys(CustomerNumber);
			driver.findElement(By.name("inideposit")).sendKeys("1000");
			driver.findElement(By.name("button2")).click();
		}
		

}
