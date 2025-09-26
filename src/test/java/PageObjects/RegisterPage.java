package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {
	
	public  RegisterPage(WebDriver driver) {
		super(driver);
		
		
	}
@FindBy(xpath="//*[@name='firstName']")
WebElement Fname;

@FindBy(xpath="//*[@name='lastName']")
WebElement Lname;

@FindBy(xpath="//*[@class='a-dropdown__placeholder']")
WebElement TypeDoc;

@FindBy(xpath="//*[text()=' Pasaporte']")
WebElement DocName;


@FindBy(xpath="//*[@name='id']")
WebElement DocNum;

@FindBy(xpath="//*[@name='userName']")
WebElement Email;

@FindBy(xpath="//*[@name='number']")
WebElement PhoneNum;

@FindBy(xpath="//*[@id='registrationPassword']")
WebElement Password;


@FindBy(xpath="(//*[@class='a-checkbox__custom'])[2]")
WebElement chcbox1;

@FindBy(xpath="(//*[@class='a-checkbox__custom'])[1]")
WebElement chcbox2;

@FindBy(xpath="//*[text()='Registrarse']")
WebElement Submitbtn;




public void firstname (String firstname) {
	Fname.sendKeys(firstname);
}

public void lastname(String lastname)  {
	Lname.sendKeys(lastname);
	
}

public void Documentype() {
	TypeDoc.click();
	
 
}
public void dropvalue() {
	DocName.click();
}

public void DocNumber(String numberdoc) {
	DocNum.sendKeys(numberdoc);
}

public void RegEmail(String email ) {
	Email.sendKeys(email);
}

public void Phonenumber(String phonenumber) {
	PhoneNum.sendKeys(phonenumber);
}

public void RegPassword(String pass) {
	Password.sendKeys(pass);
}

public void checkcbox1() {
	chcbox1.click();
}

public void checkcbox2() {
	chcbox2.click();
}

public void Submit() {
	Submitbtn.click();
}
}




