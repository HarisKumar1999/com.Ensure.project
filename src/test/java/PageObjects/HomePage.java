package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
@FindBy(xpath="(//*[text()=\"FAQ\"])[1]")
WebElement linkFAQ;

@FindBy(xpath="//*[text()=\"REGISTRO\"]")
WebElement linkRegister;

@FindBy(xpath="//*[text()='LOGIN']")
WebElement Linklogin;


public void clickFAQ() {
	linkFAQ.click();
	
}

public void clickRegister() throws InterruptedException {
	linkRegister.click();
	
}

public void clickLogin() {
	Linklogin.click();
}
}



