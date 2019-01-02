package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login extends BaseClass {
	
	
    @FindBy(xpath="//*[@placeholder='User ID']")
	
	 private WebElement unTB;
	
    
	
	@FindBy(xpath="//*[@placeholder='Password']")
	
	private WebElement pdTB;
	
	
	
	@FindBy(xpath="//*[@class=\"login-btn\"]")
	
	private WebElement loginBtn;
	
	
	public  Login(WebDriver driver) {
		
		super (driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getuntb1() {
		unTB.clear();
		return unTB;
	}
	
	public WebElement getpwTB1() {
		pdTB.clear();
		return pdTB;
	}
	
	public WebElement getlogin() {
		
		return loginBtn;
	}
	
	
}
