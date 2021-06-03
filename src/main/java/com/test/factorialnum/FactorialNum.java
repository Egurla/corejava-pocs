
package com.test.factorialnum;

import java.util.Scanner;

public class FactorialNum {

	public static int factorialNum(int num) {
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}

		return fact;
	}
}
