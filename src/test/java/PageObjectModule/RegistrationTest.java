package PageObjectModule;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
	@Test
	public void VerifyFlightReg() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	 RegistrationPage RgPaGe=new  RegistrationPage (driver);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 
	 RgPaGe.ClickRegLink();
	 RgPaGe.SetFirstname("Ashirwada");
	 RgPaGe.SetLastName("Ashirwada D'souza");
	 RgPaGe.SetPhone("8050643090");
	 RgPaGe.SetUsername("ashirwada1003@gmail.com");
	 RgPaGe.Address("bidar");
	 RgPaGe.cityname("Eden colony");
	 RgPaGe.statename("Karnataka");
	 RgPaGe.postcode("585401");
	 RgPaGe.countryname("India");
	 RgPaGe.nameemail("ashirwada1003@gmail.com");
	 RgPaGe.setpassword("ashirwada@02");
	 RgPaGe.confirmpassword("ashirwada@02");
	 RgPaGe.submitbuton();
	 
	 //Validation
	 if(driver.getPageSource().contains("Thank you for registering")) {
		 System.out.println("You have resgistered sucessfully - test is passed");
	 }
	 else {
		 System.out.println("Your Registration is failed - Test failed");
	 }
			 
		
	}

}
