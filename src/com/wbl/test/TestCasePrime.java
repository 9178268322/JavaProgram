package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.wbl.imp.PrimeNumber;

public class TestCasePrime {

	//@Test
	public void test() {
		int num = 8;
		boolean result = PrimeNumber.isPrimeNumber(num);
		assertFalse(result);
	}
	
	//@Test
	public void tes2() {
		int num = 0;
		boolean result = PrimeNumber.isPrimeNumber(num);
		assertFalse(result);
	}
	
	//@Test
	public void tes3() {
		int num = 7;
		boolean result = PrimeNumber.isPrimeNumber(num);
		assertFalse(!result);
	}
	
	@Test
	public void tes4() {
		int num = -5;
		boolean result = PrimeNumber.isPrimeNumber(num);
		assertFalse(!result);
	}
	
}
