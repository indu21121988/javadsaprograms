package com.slice;

public class MaxDoubleSlice {

	
	/*
	 * Find the maximal sum of any double slice
	 * maxEndingHere (left->right)
	 * maxEndingHere[i] = max(0, maxEndingHere[i-1] + A[i])
	 * maxStartingHere[i] = max(0, maxStartingHere[i+1] + A[i]
	 * 	 */
	public static int findMaxDoubleSizeSum(int[] array) {
		
		int n = array.length;
		if(n < 3) {
			return 0;
		}
		
		int[] maxEndingHere = new int[n];
		int[] maxStartingHere = new int[n];
		
		//Left to right
		for(int i=1;i<n-1;i++) {
			maxEndingHere[i] = Math.max(0, maxEndingHere[i-1] + array[i]);
		}
		
		//Right to left
		for(int i =n-2;i>0;i--) {
			maxStartingHere[i] = Math.max(0, maxStartingHere[i+1] + array[i]);
		}
		
		int maxDoubleSlice = 0;
		//combine result
		for(int y=1;y<n-1;y++) {
			int current = maxEndingHere[y-1] + maxStartingHere[y+1];
			maxDoubleSlice = Math.max(maxDoubleSlice, current);
		}
		return maxDoubleSlice;
	}
	
	public static void main(String[] args) {
		int[] A = {3,2,6,-1,4,5,-1,2};
		int result = findMaxDoubleSizeSum(A);
		System.out.println("result : " + result);
	}
}
