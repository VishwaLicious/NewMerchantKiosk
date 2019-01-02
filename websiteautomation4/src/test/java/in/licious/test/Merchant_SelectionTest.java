package in.licious.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import in.licious.pom.BaseClass;
import in.licious.pom.Login;
import in.licious.pom.Merchant_selectionPage;
import in.licious.pom.UserOnboard;
import in.licious.util.*;

public class Merchant_SelectionTest extends BaseClass {


	@Test (priority=2)
	public void merchantSelection() throws InterruptedException {


		
		//   Following is the test script for Merchant_selectionPage

		Merchant_selectionPage ms= new Merchant_selectionPage(driver);


		ms.getMerchantName();

		Thread.sleep(2000);



		ms.getMerchantCity();

		Thread.sleep(2000);



		ms.getMerchantStore();

		Thread.sleep(2000);


		ms.getConform().click();


        //   Following is the test script for User On board

		UserOnboard u= new UserOnboard(driver);

		Thread.sleep(2000);

		u.getphtb1().click();

		u.getphtb1().sendKeys("9620640544");


		Thread.sleep(2000);

		u.getlogin().click();
		
		
		
		// select cust address from drp down
		
		//u.getCustAddress();
		
		
		//checking existing user
		
		Thread.sleep(2000);
		u.testing();
		
		
		
	}


}
