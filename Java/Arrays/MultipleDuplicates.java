package com.demo;

import java.util.Arrays;

public class MultipleDuplicates {
	

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,6,5,6};
		findDuplicate(arr);
		
	}

	private static void findDuplicate(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Duplicates are: ");
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				System.out.println(arr[i]);
			}
				
		}
		
	}
}
