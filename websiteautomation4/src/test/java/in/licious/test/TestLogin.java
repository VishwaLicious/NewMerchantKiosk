package in.licious.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.licious.pom.BaseClass;
import in.licious.pom.Login;


public class TestLogin extends BaseClass{
	
	

		@DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	     
	        return new Object[][] { { "8105325254", "Merchant@123" }};
	   }
	 
	 @Test(dataProvider = "Authentication")

	
	  public void testTestLogin(String  uname , String pwd ) throws InterruptedException {
	 
	     
	 
		Login l= new Login(driver);
			
		l.getuntb1().sendKeys(uname);
		
		Thread.sleep(2000);
		
		System.out.println();
		
		l.getpwTB1().sendKeys(pwd);	
		Thread.sleep(2000);
				
		System.out.println();
		
		l.getlogin().click();
		
				
	}
	
	
}
