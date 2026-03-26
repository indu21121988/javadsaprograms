package com.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProgram {
	
	public static int[] twoSumNumbers(int[] numbers, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0 ;i<numbers.length ;i++) {
			int output = sum - numbers[i];
			
			if(map.containsKey(output)) {
				return new int[] {map.get(output), i};
			}
			map.put(numbers[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] numArray = {8,3,5,6,7,9};
		
		int[] result = twoSumNumbers(numArray, 11);
		System.out.print(numArray[result[0]] + " " + numArray[result[1]]);	
	}

}
