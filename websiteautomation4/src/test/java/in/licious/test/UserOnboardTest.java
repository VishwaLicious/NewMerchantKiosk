package in.licious.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.licious.pom.BaseClass;
import in.licious.pom.UserOnboard;

public class UserOnboardTest  extends BaseClass {

		
	
	
	@Test()
	  public void testUserOnboard() throws InterruptedException {
	 
	     
	 
		 UserOnboard u= new UserOnboard(driver);
		 
		 Thread.sleep(2000);
		 
		 u.getphtb1().click();
		 
		 u.getphtb1().sendKeys("9620640544");
			
		
		Thread.sleep(2000);
		
		u.getlogin().click();
		
						
	}

	
	
	
}
