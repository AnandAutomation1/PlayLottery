package com.Assertion.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	/*Assrtion
	 Assserts help us to verify the conditions of the test and decide weather test
	 has failed or passed. a test is considered successful only if it is completed
	 without throwing any exception.
	 two types of assertion
	 1.Hard assertion
	 2.Soft assertion
	 The main diffrence detween Hard and soft assertion is , if particular test is failed then
	 it wont allow to execute netx further test cases in hard assert but in soft assertion it
	 will to execute further test cases
	 Hard assertion three types of command:
	 1.Assert.assertTrue()
	 2.Assert.assertFalse()
	 3.Assert.assertEqual()	 
	 */
	@Test
	void demotest() {
		Assert.assertTrue(true);//passed
		Assert.assertEquals("ashirwada","ashirwada");//true
		Assert.assertEquals("selenium", "selenium");//true
		System.out.println("Succesfully passed");
	}

}
