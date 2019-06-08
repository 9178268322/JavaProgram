package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.imp.SwapTwoNumber;

public class TestCaseSwapNumber {

	//@Test
	public void test1() {
		int a = 10;
		int b = 20;
		
		int []result = SwapTwoNumber.swapTwoNum(a, b);
		Assert.assertEquals(result[0], 10);
		Assert.assertEquals(result[1], 20);
	}
	
	//@Test
	public void test2() {
		int a = 0;
		int b = 6;
		
		int []result = SwapTwoNumber.swapTwoNum(a, b);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], 6);
	}
	
	@Test
	public void test3() {
		int a = 0;
		int b = -12;
		
		int []result = SwapTwoNumber.swapTwoNum(a, b);
		Assert.assertEquals(result[0], 0);
		Assert.assertEquals(result[1], -12);
	}
}
