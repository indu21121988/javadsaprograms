package com.slice;

public class MaxProfit {
	
	/*
	 * Given a log of stock prices compute the maximum possible earning.
	 */

	public static int findMaxProfit(int[] array) {
		int n = array.length;
		
		if(array == null || n < 2) {
			return 0;
		}
		
		int minPrice = array[0];
		int maxProfit = 0;
		
		for(int i=1;i<n;i++) {
			int profit = array[i] - minPrice;
			if(profit > maxProfit) {
				maxProfit = profit;
			}
			
			if(array[i] < minPrice) {
				minPrice = array[i];
			}
			
		}
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int[] array = {23171, 21011, 21123, 21366, 21013, 21367};
		int result = findMaxProfit(array);
		System.out.print(result);
	}
}
