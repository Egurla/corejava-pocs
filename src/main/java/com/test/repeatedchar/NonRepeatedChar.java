package com.test.repeatedchar;

public class NonRepeatedChar {
	public static char searchchar(String a, char[] b) {
		int i = 0;
		while (i != a.length()) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {
				if (i != j) {
					if (a.charAt(i) != b[j]) {
						count++;
					}
				}
				if (count == a.length() - 1) {
					return a.charAt(i);
				}
			}
			i++;
		}
		return 0;
	}

	

}
