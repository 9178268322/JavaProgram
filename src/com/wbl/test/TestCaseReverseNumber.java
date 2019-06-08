package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.ReverseNumber;

public class TestCaseReverseNumber {

	//@Test
	public void test1() {
		int num = 157;
		int result = ReverseNumber.reverseNum(num);
		Assert.assertEquals(result, 751);
	}
	
	@Test
	public void test2() {
		int num = 0;
		int result = ReverseNumber.reverseNum(num);
		assertFalse(true);
	}
}
