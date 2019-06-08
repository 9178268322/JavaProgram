package com.wbl.imp;

public class ReverseNumber {

	public static int reverseNum(int num) {

		int sum = 0;
		int r = 0;

		if (String.valueOf(num).length() == 1) {
			System.out.println("Can't reverse this number "+"'"+ num+"'");
		} else {
			while (num > 0) {

				r = num % 10;
				sum = sum * 10 + r;
				num = num / 10;
			}
		}
		
		return sum;
	}
}
