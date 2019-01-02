package in.licious.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;



public abstract class  BaseClass  {
	
	
	public static WebDriver driver;

	 static {
		
		
			 
		 System.setProperty("webdriver.chrome.driver", "D:\\Asmita\\My_Office_Work\\websiteautomation2\\chromedriver.exe");
		 
		 
		 driver=new ChromeDriver();
			
		 clear_cache(driver);
	}
	 
	 public BaseClass() {
		 
		 
		 
	 }
	 private static void clear_cache(WebDriver driver2) {
		// TODO Auto-generated method stub
		
	}
	public BaseClass(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
	
	@BeforeMethod
	 
	 public void openApp() throws InterruptedException {
		
		
		Thread.sleep(2000);
		 driver.get("http://ort-merchantkiosk.licious.in/");
		 
		 driver.navigate().refresh();
		 clear_cache(driver);
		 
		 driver.navigate().refresh();
		 
		
	}
	
}
