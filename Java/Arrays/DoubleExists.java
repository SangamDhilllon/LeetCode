package com.demo;

import java.util.HashSet;
import java.util.Set;

public class DoubleExists {

	public static void main(String[] args) {
		int[] arr= {3,1,7,11};
		System.out.println(checkIfExist(arr));
	}

	public static boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<Integer>();
		for (int i:arr) {
			if(set.contains(i*2) || (i%2==0 && set.contains(i/2)))
				return true;
			set.add(i);
		}
		return false;
    }
}
