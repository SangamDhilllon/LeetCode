package com.demo;

public class MultipleMissing {

	/* Java Program to find missing numbers in an integer 
	 * array with duplicates. Array may contains more 
	 * than one duplicates. 
	 * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9}; 
	 * output: 4, 6, 8 
	 */

	public static void main(String[] args) {
		int[] arr={1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		findMissing(arr);

	}
	public static void findMissing(int[] num) {
		
		int[] register=new int[num.length];
		
		//iterate over given array and mark all present numbers into register array
		for (int i : num) {
			register[i]=1;
		}
		
		System.out.println("Missing numbers are: ");
		for (int i = 1; i < register.length; i++) {
			if(register[i]==0)
				System.out.println(i);
		}
	}

}
