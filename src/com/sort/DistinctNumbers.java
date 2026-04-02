package com.sort;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctNumbers {

	/*
	 * given an array A consisting of N integers, returns the number of distinct values in array
	 */
	public static int findDistinctNumbersCountUsingHashset(int[] array) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i:array) {
			set.add(i);
		}
		return set.size();
	}
	
	public static int findDistinctNumbersCountUsingSort(int[] array) {
		if(array.length == 0) {
			return 0;
		}
		int count = 1;
		//before sort {2,1,1,2,3,1}
		Arrays.sort(array);
		//after sort {1,1,1,2,2,3}
		for(int i=0;i<array.length-1;i++) {
			if(array[i] != array[i+1]) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arrayHashset = {2,1,1,2,3,1};
		
		int[] arraySort = {2,1,1,2,3,1};
		
		int countHashset = findDistinctNumbersCountUsingHashset(arrayHashset);
		int countSort = findDistinctNumbersCountUsingSort(arraySort);
		
		System.out.println("distinct count using hashset : " + countHashset);
		System.out.println("distinct count using sort : " + countSort);
	}
}
