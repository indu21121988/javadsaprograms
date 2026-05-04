package com.slice;

public class MaxSubArraySum {

	/*
	 * Find a maximum sum of a compact subsequence of array elements.
	 * core formula
	 * currentSum[i] = max(A[i], currentSum[i-1] + A[i])
	 * maxSum = max(maxSum, currentSum[i])
	 */
	
	public static int findMaxSubArraySum(int[] array) {
		
		if(array == null || array.length == 0) {
			return 0;	
		}
		int currentSum = array[0];
		int maxSum = array[0];
		
		for(int i=1;i<array.length;i++) {
			currentSum = Math.max(array[i], currentSum + array[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] array = {3,2,-6,4,0};
		int result = findMaxSubArraySum(array);
		System.out.println(result);
	}
}
