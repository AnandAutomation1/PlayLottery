package com.Assertion.app;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test5 {
	
	SoftAssert softAssert=new SoftAssert();
	// if one test case is passed then it wil fail second test case also because we are creating
	//object and using object for both same.so bydefault both wil fail.
	
	
	@Test
	public void Demotest1() {
		softAssert.assertEquals("ashirwada", "ashi");//false failed
		softAssert.assertAll();
	}
	@Test
	public void Demotest2() {
		softAssert.assertEquals("ashirwada", "ashirwada");//true passsed
		softAssert.assertAll();
	}

}
