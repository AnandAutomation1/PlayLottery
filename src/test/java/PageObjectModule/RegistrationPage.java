package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement RegLink;
	
	@FindBy(name= "firstName")
	WebElement Firstname;
	
	@FindBy(name= "lastName")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(name="userName")
	WebElement Username;
	
	@FindBy(name="address1")
	WebElement Address1;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement PostalCode;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(name="submit")
	WebElement Submit;
	
	RegistrationPage(WebDriver d){
		//this.driver=driver;
		driver =d;
		PageFactory.initElements(d, this);
	}
	public void ClickRegLink() {
		 RegLink.click();
		}
	public void SetFirstname(String Ashirwada) {
		Firstname.sendKeys(Ashirwada);
	}
	public void SetLastName(String Vijaykumar) {
		LastName.sendKeys(Vijaykumar);
	}
	public void SetPhone(String ph) {
		Phone.sendKeys(ph);
	}
	public void SetUsername(String ashirwada1003) {
		Username.sendKeys(ashirwada1003);
	}
	public void Address(String addr1) {
		Address1.sendKeys(addr1);
	}
	public void cityname(String Bidar) {
		City.sendKeys(Bidar);
	}
	public void statename(String Karnataka) {
		State.sendKeys(Karnataka);
	}
	public void postcode(String postalcode) {
		PostalCode.sendKeys(postalcode);
	}
	public void countryname(String india) {
		Country.sendKeys(india);
	}
	public void nameemail(String ashi) {
		username.sendKeys(ashi);
	}
	public void setpassword(String ashi123) {
		Password.sendKeys(ashi123);
	}
	public void confirmpassword(String pass) {
		ConfirmPassword.sendKeys(pass);
	}
	public void submitbuton() {
		Submit.click();
	}
	
	}
