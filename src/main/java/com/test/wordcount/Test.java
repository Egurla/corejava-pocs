package com.test.wordcount;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		WordCount.isPresent(str);
	}
}
