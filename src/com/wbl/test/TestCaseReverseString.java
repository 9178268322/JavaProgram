package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.RevrseString;

public class TestCaseReverseString {

	@Test
	public void test1() {
		
		String str = "hel lo";
		String result = RevrseString.revString(str);
		Assert.assertEquals(result, "ol leh");
	}
	
	//@Test
	public void test2() {
		
		String str = "j";
		String result = RevrseString.revString(str);
		assertFalse(true);
	}
	
	//@Test
	public void test3() {
		
		String str = "-java";
		String result = RevrseString.revString(str);
		Assert.assertEquals(result, "avaj-");
	}
	
	//@Test
	public void test4() {
		
		String str = "";
		String result = RevrseString.revString(str);
		assertFalse(true);
	}
}
