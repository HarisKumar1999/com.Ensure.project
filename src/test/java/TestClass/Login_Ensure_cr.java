package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.BasePage;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class Login_Ensure_cr extends BasePage {

		public Login_Ensure_cr(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		public WebDriver driver;
		
	
		public void logintest() {
			HomePage hp = new HomePage(driver);
			hp.clickFAQ();
			hp.clickLogin();
	
		LoginPage lg = new LoginPage(driver);
	//	lg.email("randomeString()+\"@gmail.com\"");
		lg.email("Test12345@gmail.com");
		lg.paxsword("Abbott@123");
		lg.submit();
		}
}
	
	
