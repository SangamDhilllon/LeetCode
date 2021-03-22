package com.demo;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {-1,2,3,4,5};
		reverse(arr);
		System.out.println("reversed array: ");
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public static int[] reverse(int[] num) {
		int temp;
		int n=num.length;
		for (int i = 0; i < n/2; i++) {
			temp=num[i];
			num[i]=num[n-i-1];
			num[n-i-1]=temp;
		}
		
		return num;
	}
}
