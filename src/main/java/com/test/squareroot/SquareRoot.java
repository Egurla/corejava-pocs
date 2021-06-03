package com.test.squareroot;

public class SquareRoot {
	static boolean checkPerfectSquare(double x) {

		double sq = Math.sqrt(x);

		System.out.println(sq);
		return ((sq - Math.floor(sq)) == 0);
		
	}
}
