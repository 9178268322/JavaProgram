package com.wbl.imp;

public class RevrseString {

	public static String revString(String str) {
		
		String rev = "";
		
		if(str.length()<=1) {
			System.out.println("Can't perform reverse string");
		}
		else {
			for(int i=str.length()-1;i>=0;i--) {
				rev = rev+str.charAt(i);
			}
		}
		return rev;
	}
}
