package com.test;

public class PassingCars {
	
	/*
	 * A common interpretation of “Count the number of passing cars” problem is:

0 = car traveling east

1 = car traveling west

A passing pair occurs when an east car (0) appears before a west car (1).

So for every 1, we count how many 0s appeared before it.
	 */
	
	public static int countPairs(int[] array) {
		
		int eastCars = 0;
		int pairCars = 0;
		for(int num : array) {
			if(num == 0) {
				eastCars++;
			} else if(num == 1) {
				pairCars+=eastCars;
			}
		}
		return pairCars;
	}

	public static void main(String[] args) {
		int[] array = {0,1,0,1,1,0,1,1};
		int totalPairs = countPairs(array);
		System.out.print(totalPairs);
	}
	/*
	 * array[0] = 0
	 * array[1] = 1
	 * array[2] = 0
	 * array[3] = 1
	 * array[4] = 1
	 * array[5] = 0
	 * array[6] = 1
	 * array[7] = 1
	 * 
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 * 0,1
	 *
	 */
}
