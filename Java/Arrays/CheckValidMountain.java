package com.demo;

public class CheckValidMountain {

	public static void main(String[] args) {
		int[] arr= {0,3,4,5,3,2,1};
		System.out.println(validMountainArray(arr));
	}

	public static boolean validMountainArray(int[] arr) {
		
		if(arr.length<3)
			return false;
		
		int i=0;
		int j=arr.length-1;
		int n=arr.length;
		
		while(i+1<n && arr[i]<arr[i+1])
			i++;
		while(j>0 && arr[j-1]>arr[j])
			j--;
		return i>0 && i==j && j<n-1;
		
    }
}
