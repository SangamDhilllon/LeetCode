package com.demo;

public class MissingInteger {

	
	public static void main(String[] args) {
		int[] arr= {1,2,3,5,6};
		missingNumber(arr);
	}

	private static void missingNumber(int[] arr) {
		int len=arr.length+1;
		int sum=((len+1)*len)/2;
		int reducedSum=0;
		for (int i : arr) {
			reducedSum+=i;
		}
		
		System.out.println("Missing number= "+(sum-reducedSum));
	}
}
