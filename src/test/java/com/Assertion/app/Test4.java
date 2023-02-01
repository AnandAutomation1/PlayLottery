package com.Assertion.app;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {
	
	/*SoftAssertion
	 Even though if certain assert conditions fails then next cases will execute
	 it will not stop .
	 1.SostAssert softAssert=new SoftAssert();
	 softassert.assertTrue(condition);
	 softassert.assertAll();
	 */
	SoftAssert softAssert=new SoftAssert();
	@Test
	public void DemoTest() {
		
		softAssert.assertTrue(true);//passed
		softAssert.assertEquals("ashirwada", "Ashirwada");//false-failed
		softAssert.assertEquals("selenium", "selenium");//true-passed
		System.out.println("Succesfully passed the test");
		softAssert.assertAll();
	}

}
