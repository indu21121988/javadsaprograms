package com.sort;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] numArray = {2,1,5,6,3};
		
		int n = numArray.length;
		for(int i=0;i<n;i++) {
			int mininumIndex = i;
			for(int j=i+1;j<n;j++) {
				if(numArray[j] < numArray[mininumIndex]) {
					mininumIndex = j;
				}
			}
			int temp = numArray[mininumIndex];
			numArray[mininumIndex] = numArray[i];
			numArray[i] = temp;
		}
		System.out.println(Arrays.toString(numArray));
		
	}

}
