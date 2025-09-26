package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	
@FindBy(xpath="//*[@name='loginID']")
WebElement logemail;

@FindBy(xpath="//*[@name='password']")
WebElement logpass;

@FindBy(xpath="")
WebElement logEnter;

public void email (String lname) {
	logemail.sendKeys(null);
}
	public void paxsword(String lpass) {
		logpass.sendKeys(null);
	}
	public void submit() {
		logEnter.click();
	}
}

