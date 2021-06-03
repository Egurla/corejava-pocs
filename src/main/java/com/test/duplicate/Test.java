package com.test.duplicate;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;
		n = RemoveDuplicate.Duplicate(arr, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
