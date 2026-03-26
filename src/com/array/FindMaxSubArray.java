package com.array;

public class FindMaxSubArray {
	
	public static void main(String[] args) {
		
		int[] numArray = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int result = maxSubArray(numArray);
		System.out.print(result);
	}
	
	public static int maxSubArray(int[] nums) {
		if(nums == null || nums.length == 0) {
			return 0;
		}
		
		int maxSoFar = nums[0];
		int currentMax = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}

}
