package com.demo;

import java.util.Arrays;

public class findDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,3,6,6,5};
		findDuplicate(arr);
	}

	private static void findDuplicate(int[] arr) {

		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1])
				System.out.println("Duplicate= "+arr[i]);
		}
	}
}
