package com.demo;

public class DuplicateZeros {

	public static void main(String[] args) {
		int[] num = { 1, 0, 2, 0, 3, 4 };
		duplicateZeros(num);

	}

	public static void duplicateZeros(int[] arr) {

		int zeroes = 0;
		for (int i : arr) {
			if (i == 0) {
				zeroes++; // count zeroes in original array
			}
		}
		// j= last index of increased length
		int i = arr.length - 1, j = arr.length + zeroes - 1;

		while (i != j) {
			insert(arr, i, j--);
			if (arr[i] == 0) {
				insert(arr, i, j--);   // insert and decrement j one more time
			}
			i--;
		}

		
		for (int k : arr) { // print final array
			System.out.println(k);
		}

	}

	// insert element from ith to jth position if j is not out of bound
	private static void insert(int[] arr, int i, int j) {
		if (j < arr.length) {
			arr[j] = arr[i];
		}
	}

}
