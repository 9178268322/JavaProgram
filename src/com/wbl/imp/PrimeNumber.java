package com.wbl.imp;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		int count = 0;
		boolean b = false;

		if (num < 0) {
			System.out.println("Negative integer can't be prime");
		} else {
			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}
}
