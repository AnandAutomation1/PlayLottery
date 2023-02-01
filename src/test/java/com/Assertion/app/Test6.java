package com.Assertion.app;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test6 {
	
	SoftAssert softAssert1=new SoftAssert();
	SoftAssert softAssert2=new SoftAssert();
	
	@Test
	public void DemoTest1() {
		softAssert1.assertEquals("ashirwada", "ashi");//false-failed
		softAssert1.assertAll();
	}
	@Test
	public void Demotest(){
		softAssert2.assertEquals("selenium", "selenium");
		softAssert2.assertAll();
		
	}
	

}
