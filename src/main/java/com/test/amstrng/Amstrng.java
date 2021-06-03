package com.test.amstrng;

public class Amstrng {

	public static boolean is_Amstrong(int n) {
		int remainder, sum = 0;
		int temp=n;
		while (n > 0) {
			remainder = n % 10;
			sum = sum + (remainder * remainder * remainder);
			n = n / 10;
		}
		return sum == temp;
	}

}
