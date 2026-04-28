package com.leader;

public class MajorityElementIndex {
	
	/*
	 * An array A consisting of N integers is given. The dominator of array A 
	 * is the value that occurs in more than half of the elements of A.
	 * The most efficient way is Boyer–Moore Voting Algorithm + verification

For example, consider array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with 
indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
	 */

	public static int findMajorityIndex(int[] array) {
		int candidate = array[0];
		int count = 1;
		
		for(int i = 1;i<array.length;i++) {
			if(array[i] == candidate) {
				count++;
			} else {
				count--;
				if(count == 0) {
					candidate = array[i];
					count = 1;
				}
			}
		}
		
		int frequency = 0;
		int index = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i] == candidate) {
				frequency++;
				index = i;
			}
		}
		
		if(frequency > array.length/2) {
			return index;
		} 
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = {3,4,3,2,3,-1,3,3};
		int count = findMajorityIndex(array);
		System.out.println(count);
	}
}
