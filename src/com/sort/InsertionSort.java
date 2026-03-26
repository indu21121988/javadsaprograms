package com.sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] numArray = {2,1,4,5,3};
		
		int n = numArray.length;
		for(int i=1;i<n;i++) {
			int key = numArray[i];
			int j = i-1;
			
			while (j>=0 && numArray[j] > key) {
				numArray[j+1] = numArray[j];
				j = j-1;
			}
			numArray[j+1] = key;
		}
		
		System.out.println(Arrays.toString(numArray));
	}

}
