package com.sort;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] numArray = {2,5,1,3};
		boolean swap;
		int n = numArray.length;
		for(int i=0;i<n;i++) {
			swap = true;
			for(int j=0;j<n-i-1;j++) {
				if(numArray[j] > numArray[j+1]) {
					int temp = numArray[j];
					numArray[j] = numArray[j+1];
					numArray[j+1] = temp;
					swap = true;
				}
			}
			if(!swap) break;
		}
		System.out.println(Arrays.toString(numArray));
	}

}
