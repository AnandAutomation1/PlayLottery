package com.Assertion.app;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	void demotest1() {
		Assert.assertTrue(true);
		Assert.assertEquals("Ashirwada", "ashirwada"); //false
		Assert.assertEquals("selenium", "selenium"); //if above assert is false then entire test case will be failed rest of the things will no be continued
		System.out.println("Successfully passes the test");
	}

}
