package com.wbl.test;

import static org.testng.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.wbl.imp.CompareTwoArrays;

public class TestCaseTwoArray {

	CompareTwoArrays compareTwoArrays;
	
	//@Test
	public void test1() {
		
		compareTwoArrays = new CompareTwoArrays();
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 4, 5, 6 };
	    
		boolean reuslt = compareTwoArrays.isTwoArrayEqual(arr1, arr2);
		assertFalse(!reuslt);
	}
	
	//@Test
	public void test2() {
		
		compareTwoArrays = new CompareTwoArrays();
		int[] arr1 = { 1, 2, 3, 4, 4, 5 };
		int[] arr2 = { 1, 2, 3, 4, 4, 5,};
	    
		boolean reuslt = compareTwoArrays.isTwoArrayEqual(arr1, arr2);
		assertFalse(!reuslt);
	}
	
	//@Test
	public void test3() {
		
		compareTwoArrays = new CompareTwoArrays();
		int[] arr1 = { -1, 2, 3, -4, 4, 5};
		int[] arr2 = { -1, 2, 3, -4, 4, 5};
	    
		boolean reuslt = compareTwoArrays.isTwoArrayEqual(arr1, arr2);
		assertFalse(!reuslt);
	}
	
	//@Test
	public void test4() {
		
		compareTwoArrays = new CompareTwoArrays();
		int[] arr1 = { -1, 2, 3, -4, 4, 5};
		int[] arr2 = { -1, 2, 3, -4, 4, 5,-8};
	    
		boolean reuslt = compareTwoArrays.isTwoArrayEqual(arr1, arr2);
		assertFalse(!reuslt);
	}
	@Test
		public void test5() {
			
			compareTwoArrays = new CompareTwoArrays();
			int[] arr1 = { 3, 4, 5, 6, 7, 8};
			int[] arr2 = { 3, 4, 6, -7, 8, 8};
		    
			boolean reuslt = compareTwoArrays.isTwoArrayEqual(arr1, arr2);
			assertFalse(!reuslt);
		}
	
}
