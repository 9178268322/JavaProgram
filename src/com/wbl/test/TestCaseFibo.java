package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.FibonacciSeriesNumber;

public class TestCaseFibo {

	//@Test
	public void test1() {
		
		int range = 5;
		int result = FibonacciSeriesNumber.findFibo(range);
		Assert.assertEquals(result, 12);
	}
	
	//@Test
	public void test2() {
		
		int range = -7;
		FibonacciSeriesNumber.findFibo(range);
		assertFalse(true);
	}
	
	//@Test
	public void test3() {
		
		int range = 0;
		int result = FibonacciSeriesNumber.findFibo(range);
		Assert.assertEquals(result, 0);
	}
	
	@Test
	public void test4() {
	
		int range = 1;
		int result = FibonacciSeriesNumber.findFibo(range);
		Assert.assertEquals(result, 1);
	}
}
