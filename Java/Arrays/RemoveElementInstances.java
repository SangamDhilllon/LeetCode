package com.demo;

public class RemoveElementInstances {

	public static void main(String[] args) {
		int[] arr= {3,2,2,3};
		int val=3;
		int len=removeElement(arr,val);
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}

	}

	
	public static int removeElement(int[] nums, int val) {        
        int i=0; //first pointer
        
        for (int j=0;j< nums.length;j++) { //second pointer
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
			//else only increment j
		}
        return i;
    }
}
