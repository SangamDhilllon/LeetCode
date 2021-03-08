package com.demo;

public class RemoveDuplicatesFromSortedArray {
	//Given a sorted array nums, remove the duplicates in-place 
	//each element appears only once and returns the new length.
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4};
		int len=removeDuplicates(arr);
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int removeDuplicates(int[] nums) {        
        int i=0; //first pointer
        for (int j=1;j< nums.length;j++) { //second pointer
			if(nums[j]!=nums[i]) {
				i++;
				nums[i]=nums[j];
			}
		}
        return i+1;
    }
}
