package com.stack;

import java.util.Stack;

public class FishSurvival {
	
	/*
	 * Fish number P is represented by A[P] and B[P]. Array A contains the sizes of the fish. 
	 * All its elements are unique. Array B contains the directions of the fish. It contains only 0s and/or 1s,
	 *  where:
		0 represents a fish flowing upstream,
		1 represents a fish flowing downstream.
	 */
	public static int countSurvivalFish(int[] a, int[] b) {
		Stack<Integer> downstream = new Stack<Integer>();
		int survival = 0;
		
		for(int i =0;i<a.length;i++) {
			
			int size = a[i];
			int direction = b[i];
			
			if(direction == 1) {
				downstream.push(size);
			} else {
				boolean eaten = false;
				while(!downstream.isEmpty()) {
					if(downstream.peek() > size) {
						eaten = true;
						break;
					} else {
						downstream.pop();
					}
				}
				if(!eaten) {
					survival++;
				}
			}
		}
		return survival + downstream.size();
	}
	
	public static void main(String[] args) {
		int[] fishsize = {4,3,2,1,5};
		int[] direction = {0,1,0,0,0};
		
		int result = countSurvivalFish(fishsize, direction);
		System.out.println(result);
	}

}
