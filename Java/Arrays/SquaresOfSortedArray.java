package com.demo;

import java.util.Arrays;

public class SquaresOfSortedArray {

//Given an integer array nums sorted in increasing order, 
//return an array of the squares of each number sorted in increasing order.
	public static void main(String[] args) {
		int[] arr= {-7,-3,2,3,11};
		int newarr[]=sortedSquares(arr);
		for(int number:newarr)
			System.out.println(number);
	}
	
	public static int[] sortedSquares(int[] nums) {
        int[] squares=new int[nums.length];
        
        for(int i=0;i<nums.length;i++) {
        	squares[i]=nums[i]*nums[i];
        }
        Arrays.sort(squares);
        return squares;
    }
}
