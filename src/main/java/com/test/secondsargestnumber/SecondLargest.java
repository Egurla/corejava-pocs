package com.test.secondsargestnumber;

public class SecondLargest {
	public static int SecondHighest(int array[]) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {

				secondHighest = highest;

				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest)
				secondHighest = array[i];
		}

		return secondHighest;
	}
}
