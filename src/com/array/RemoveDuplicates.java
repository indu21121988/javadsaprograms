package com.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] numArray = {1,1,3,4,5,5};
		int[] uniqueArray = Arrays.stream(numArray).distinct().toArray();
		System.out.println(Arrays.toString(uniqueArray));
		
		Integer[] numArray2 = {1,6,3,4,5,5};
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(numArray2));
		
		Integer[] uniquesetArray = set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(uniquesetArray));
		
		//using array
		int[] numArrayusingArray = {2,4,1,3,3};
		Arrays.sort(numArrayusingArray);
		System.out.println(Arrays.toString(numArrayusingArray));
	}

}
