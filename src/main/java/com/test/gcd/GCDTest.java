package com.test.gcd;

public class GCDTest {
	 

	public static int gcdTest(int n1,int n2,int GCD) {
		int i;
	
		for (i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				GCD = i;
			}
		}
		System.out.println("\n GCD of " + n1 + " and " + n2 + "  =  " + GCD);
		return GCD;
	}

}
