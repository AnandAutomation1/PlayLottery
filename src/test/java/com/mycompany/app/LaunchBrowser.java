package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
	
	@Test
	public void Browser() {
		WebDriverManager.chromedriver().setup();
		
	}
	@Test
	public void LaunchTheApplicationUrl() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//a[normalize-space()='Sign In']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='User Name']")).sendKeys("Ashirwada");
		driver.findElement(By.xpath("//label[normalize-space()='Password']")).sendKeys("asi@123");
		driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
		
		
		
		
	}

}
