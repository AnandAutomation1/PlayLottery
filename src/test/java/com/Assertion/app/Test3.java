package com.Assertion.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	
	@Test
	void DemoTest1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement username=driver.findElement(By.name("userName"));
		WebElement password=driver.findElement(By.name("password"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("mercury");
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("mercury");
		driver.findElement(By.name("submit")).click();
		
		String expted="Login: Mercury Tours";
		Assert.assertEquals(expted,driver.getTitle());
		driver.close();
		
	
	}

}
