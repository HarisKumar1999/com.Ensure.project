package TestClass;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.HomePage;
//import PageObjects.LoginPage;
import PageObjects.RegisterPage;
import PageObjects.RegisterPage;

public class Registration_Ensure_cr {

	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://ensure.abbott/cr");
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void teardown() {
		driver.quit();
	}*/
	
	
	@Test
	public void Verify_Registration() throws InterruptedException {
	HomePage hp = new HomePage(driver);
	hp.clickFAQ();
	Thread.sleep(20);
	hp.clickRegister();
	Thread.sleep(20);
	//hp.clickLogin();
	
	
	RegisterPage rp = new RegisterPage(driver);
	rp.firstname("Harish");
	rp.lastname("Kumar");
	//rp.RegEmail(randomeString()+"@gmail.com");
	rp.RegEmail("Test77@gmail.com");
	rp.Phonenumber("+50612345678");
	rp.Documentype();
	rp.dropvalue();
	rp.DocNumber("543567877");
	rp.RegPassword("Abbott@123");
	rp.checkcbox1();
	rp.checkcbox2();
	Thread.sleep(6);
	rp.Submit();
	
	//LoginPage lg = new LoginPage(driver);
	//lg.txtemail("Test1234@gmail.com");
	//lg.txtpass("Abbott@123");
	//lg.btnenter();

}
	public String randomeString() {
	String	generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
		
	}
	
	public String randomNumber() {
	String generatednumber= 	RandomStringUtils.randomNumeric(6);
		return generatednumber;
	}
	
	
	public String randomAlphaNumeric() {
	String generateAlphanum = 	RandomStringUtils.randomAlphanumeric(6);
		return generateAlphanum;
	}
	
	
}


