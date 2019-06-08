package com.wbl.imp;

public class FactorialNumber {
	
	public static int findFactorial(int num) {
		
		int fact  = 1;
		
		if(num<0) {
		    System.out.println("Factorial doesn't exits");
		    
		}
		else if(num == 0) {
			fact = 1;
		}
		else if(num>1){
			for(int i=1;i<=num;i++) {
				fact = fact*i;
			}
		}
		
		return fact;
	}
}