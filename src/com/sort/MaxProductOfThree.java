package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProductOfThree {

	public static int findMaxProduct(int[] A) {
		Arrays.sort(A);
		int n = A.length;
		
		int firstProduct = A[n-1] * A[n-2] * A[n-3];
		int secondProduct = A[0] * A[1] * A[n-1];
		
		return Math.max(firstProduct, secondProduct);
	}
	
	public static void main(String[] args) {
		int[] array = {-3,1,2,-2,5,6};
		int result = findMaxProduct(array);
		System.out.println(result);
	}
}
