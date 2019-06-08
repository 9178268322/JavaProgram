package com.wbl.test;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.wbl.imp.RemoveDuplicate;

public class TestCaseRemoveDuplicates {

	//@Test
	public void test1() {
		int []arr = {8,3,4,6,8,4,6,3};
		RemoveDuplicate.removeDup(arr);
	}
	
	//@Test
	public void test2() {
		int []arr = {-12,3,4,6,8,-4,6,-12,-3};
		RemoveDuplicate.removeDup(arr);
	}
	
	@Test
	public void test3() {
		int []arr = {};
		RemoveDuplicate.removeDup(arr);
		assertFalse(true);
	}
}
