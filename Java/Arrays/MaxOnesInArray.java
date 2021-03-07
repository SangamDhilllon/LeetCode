package com.demo;

public class MaxOnesInArray {

	public static void main(String[] args) {
		int[] arr= {1,0,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}

	
	//Runtime=O(n) Space=o(1)
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int countMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                    count++;
                    if(count>=countMax)
                    	countMax=count;
            }else
                count=0;
        }
        return countMax;
    }
}
