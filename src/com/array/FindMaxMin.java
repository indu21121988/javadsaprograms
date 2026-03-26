package com.array;

import java.util.Arrays;

public class FindMaxMin {
	public static void main(String[] args) {
		//using java8
		int[] numarray = {3,1,5,7,8};
		int min = Arrays.stream(numarray).min().getAsInt();
		int max = Arrays.stream(numarray).max().getAsInt();
		System.out.println(min);
		System.out.println(max);
		//without using java8
		int minval = numarray[0];
		int maxval = numarray[0];
		for(int i=0;i<numarray.length;i++) {
			if(numarray[i] > maxval) {
				maxval = numarray[i];
			} else if(numarray[i] < minval) {
				minval = numarray[i];
			}
		}
		System.out.println(minval);
		System.out.println(maxval);
		
	}

}
