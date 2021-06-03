package com.test.vowel;

public class VowelIsPresent {

	public static void isPresent(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Vowels " + count);
	}
}
