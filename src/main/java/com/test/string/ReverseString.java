package com.test.string;

public class ReverseString {
	public static void reverseString(String str) {
		if (str.isEmpty()) {
			System.out.println("please Enter String: ");
		}else { 
		StringBuilder sb=new StringBuilder(str);
		StringBuilder revese=sb.reverse();
		String s=new String(revese);
		System.out.println(s+"   "+str);
		
		}
	}
}
