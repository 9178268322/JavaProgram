package com.wbl.imp;

public class FibonacciSeriesNumber {

	public static int findFibo(int range) {

		int a = 0, b = 1, c = 0;
		int sum = 0;

		if (range < 0) {
			System.out.println("Can't find fibonacci series");
		} else {

			for (int i = 0; i <= range; i++) {
				System.out.println(a);
				sum = sum + a;
				c = a + b;
				a = b;
				b = c;
			}
		}
		return sum;
	}
}
