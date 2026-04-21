package com.sort;

import java.util.Arrays;

public class DiscIntersection {

	
	/*
	 * We draw N discs on a plane. The discs are numbered from 0 to N − 1. An array A of N non-negative integers, 
	 * specifying the radiuses of the discs, is given. The J-th disc is drawn with its center at (J, 0) and radius 
	 * A[J].

	   We say that the J-th disc and K-th disc intersect if J ≠ K and the J-th and K-th discs have at least one 
	   common point (assuming that the discs contain their borders).
	 */
	
	public static int findDiscIntersect(int[] array) {
		int n = array.length;
		long[] left = new long[n];
		long[] right = new long[n];
		
		for(int i =0;i<n;i++) {
			left[i] = i - array[i];
			right[i] = array[i] + i;
		}
		
		Arrays.sort(left);
		Arrays.sort(right);
		
		int j =0;
		int intersection = 0;
		int active = 0;
		
		for(int i =0;i<n;i++) {
			while(j < n && left[j] <= right[i]) {
				intersection = intersection + active;
				active++;
				j++;
			}
			active--;
			if(intersection > 10_000_000) {
				return -1;
			}
		}
		return intersection;
	}
	
	public static void main(String[] args) {
		int[] array = {1,5,2,1,4,0};
		int result = findDiscIntersect(array);
		System.out.println(result);
	}
}
