package in.licious.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Merchant_selectionPage extends Login  {
	
		 	
	

    @FindBy(xpath="//*[@class='city-dropdown']/select")
	
	 private WebElement drpDW1;
    
	
    
	@FindBy(xpath="//*[@class='merchant-name-select']/select")
	
	private WebElement drpDW2;
	
	
	
    @FindBy(xpath="//*[@class='merchant-store-select']/select")
	
	private WebElement drpDW3;
   
	
	
	@FindBy(xpath="//button[.='CONFIRM & PROCEED']")

	private WebElement conformBtn;
	
	
	
    public  Merchant_selectionPage(WebDriver driver) {
		
		super (driver);
		
		PageFactory.initElements(driver, this);
	}
    
    
	
    public void getMerchantName() {
    	
    	drpDW1.click();
    	List<WebElement> options = drpDW1.findElements(By.tagName("option"));
    	
    	for (WebElement option : options) {
    		
    		
    		if("Nilgiris".equals(option.getText()))
    		option.click();
    	}
    	
		
		
	}
	
    public void getMerchantCity() {
    	
		
    	drpDW2.click();
    	List<WebElement> options = drpDW2.findElements(By.tagName("option"));
    	
    	for (WebElement option : options) {
    		
    		
    		if("Bangalore".equals(option.getText()))
    		option.click();
    	}
	}
    
    public void getMerchantStore() {
    	
		
    	drpDW3.click();
    	List<WebElement> options = drpDW3.findElements(By.tagName("option"));
    	
    	for (WebElement option : options) {
    		
    		
    		if("NIL-KA-BAN-KORAMANGALA".equals(option.getText()))
    		option.click();
    	}
	}
	
    public WebElement getConform() {
		
    	
		return conformBtn;
	}
	
		
}
