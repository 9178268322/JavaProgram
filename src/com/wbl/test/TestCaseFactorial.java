package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.FactorialNumber;

public class TestCaseFactorial {

	// @Test
	public void test1() {
		int num = 0;
		int result = FactorialNumber.findFactorial(num);
		Assert.assertEquals(result, 1);
	}

	// @Test
	public void test2() {
		int num = 5;
		int result = FactorialNumber.findFactorial(num);
		Assert.assertEquals(result, 120);
	}

	// @Test
	public void test3() {
		int num = -7;
		int result = FactorialNumber.findFactorial(num);
		assertFalse(true);
	}
}
