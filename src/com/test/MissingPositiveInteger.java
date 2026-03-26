package com.test;

import java.util.HashSet;

public class MissingPositiveInteger {
	
	public static int findMissingInteger(int[] array) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : array) {
			set.add(num);
		}
		
		int smallestNumber = 1;
		
		while(true) {
			if(!set.contains(smallestNumber)) {
				return smallestNumber;
			}
			smallestNumber++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,3,6,4,1,2};
		int missingNumber = findMissingInteger(array);
		System.out.print(missingNumber);
	}

}
