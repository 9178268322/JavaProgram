package com.wbl.imp;

import java.util.*;

public class RemoveDuplicate {

	public static void removeDup(int[] arr) {

		int count = 0;

		Set st = new HashSet();

		if (arr.length == 0) {
			System.out.println("We can't perform removal operation of duplicates elements");
		} else {
			System.out.println("After removed duplicates, elements are :");
			for (int i = 0; i < arr.length; i++) {
				if (st.add(arr[i])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
