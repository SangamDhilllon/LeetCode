package com.demo;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { 1,2,3,0,0,0,0,0,0,0};
		int[] nums2 = {2,5,6,4,8,7,4};
		merge(nums1,(nums1.length-nums2.length),nums2,nums2.length);

	}

	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
		 	int count=0;
	        for(int i=m;i<nums1.length;i++) { 
	        		nums1[i]=nums2[count];
	        		count++;
	        }
	        Arrays.sort(nums1);
	    }
}
