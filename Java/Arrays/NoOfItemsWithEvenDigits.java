package com.demo;

public class NoOfItemsWithEvenDigits {
	
	//Given an array nums of integers, return how many of them contain an even number of digits.
	public static void main(String[] args) {
		int[] arr= {555,9101,4844,1771};
		System.out.println(findNumbers(arr));

	}

	public static int findNumbers(int[] nums) {
        int count=0;
 //       int digits=0;
//        for(int i=0;i<nums.length;i++) {
//        	String s=Integer.toString(nums[i]);
//        	digits=s.length();
//        	if(digits%2==0)
//        		count++;
//        	digits=0;
//        }
        
        for(int number:nums) {
        	if(digitCount(number)%2==0)
        		count++;
        }
        
        return count;
    }

	private static int digitCount(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		return count;
	}
}
