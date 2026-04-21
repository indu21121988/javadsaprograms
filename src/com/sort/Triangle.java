package com.sort;

import java.util.Arrays;

public class Triangle {
	
	/*
	 * given an array A consisting of N integers, returns 1 if there exists a triangular triplet for
	 *  this array and returns 0 otherwise.
	 *  A[P] + A[Q] > A[R],
		A[Q] + A[R] > A[P],
		A[R] + A[P] > A[Q].
	 */
	
	public static int triangleOrNot(int[] array) {
		Arrays.sort(array);
		for(int i =0;i<array.length-2;i++) {
			if(array[i] + array[i+1] > array[i+2]) {
				return 1;
			} 
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] array = {10,2,5,1,8,20};
		int result = triangleOrNot(array);
		System.out.print(result);
	}
}
