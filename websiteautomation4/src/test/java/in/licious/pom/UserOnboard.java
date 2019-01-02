package in.licious.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.licious.util.DataBaseCCC;



public class UserOnboard  extends BaseClass{
	
	
		
	    @FindBy(xpath="//input[@class='search-phone-numbner']")
		
		 private WebElement phoneTB;
		
	    	
		@FindBy(xpath="//input[@class='search-user-submit']")
		
		private WebElement searchBtn;
		
		
		@FindBy(xpath="//*[@class='name-input']")
		
		private WebElement cnameTB1;
		
		
		
        @FindBy(xpath="//*[@class='phone-input']")
		
		private WebElement cphoneTB;
        
        
        @FindBy(xpath="//*[@class='existing-address']/select")
        
        private WebElement caddressDrp;
       
       @FindBy(xpath="//div[.='Existing Customer']")
		
		private WebElement txt;
       
       @FindBy(xpath="//div[@class='user-onboard-wrapper']")
		
		private WebElement cfmBTN;
				 
		
		
       public  UserOnboard(WebDriver driver) {
			
			super (driver);
			
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getphtb1() {
			
			return phoneTB;
		}
		
				
		public WebElement getlogin() {
			
			
			return searchBtn;
			
			
		}
		
		
		
		/*  public void getCustAddress() {
		    	
			  caddressDrp.click();
		    	List<WebElement> options = caddressDrp.findElements(By.tagName("option"));
		    	
		    	for (WebElement option : options) {
		    		
		    		
		    		if("Hoysala Nagar  Indiranagar, Bengaluru, Karnataka 560038, India".equals(option.getText()))
		    		option.click();
		    	}
		    	
				
				
			}*/
		
		public  void testing() {
			
			String text = txt.getText();
			
			if("Existing Customer".equals(text))
				
				cfmBTN.click();
				
							
		/*	else
			
		 System.out.println("add user..");*/
			
			
			/*DataBaseCCC db = new DataBaseCCC();
			String s2 = db.s22;
			
			System.out.println(s2);*/
						
		}
	
}
