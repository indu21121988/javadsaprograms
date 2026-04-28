package com.stack;

import java.util.Stack;

public class ManhattanSkyline {
	
	/*
	 * that, given an array H of N positive integers specifying the height of the wall,
	 *  returns the minimum number of blocks needed to build it.
	 *  Use a stack to track active heights
		For each height:
		Pop all taller heights (they end here)
		Push if current height is new (greater than top)
		Skip if equal (continue same rectangle)
		For example, given array H containing N = 9 integers:

  H[0] = 8    H[1] = 8    H[2] = 5
  H[3] = 7    H[4] = 9    H[5] = 8
  H[6] = 7    H[7] = 4    H[8] = 8
the function should return 7
	 */
	public static int countBlockNeeded(int[] heightArray) {
		Stack<Integer> blockStack = new Stack<Integer>();
		int countRectangles = 0;
		
		for(int height : heightArray) {
			
			while(!blockStack.isEmpty() && blockStack.peek() > height) {
				blockStack.pop();
			}
			
			if(height > 0 && (blockStack.isEmpty() || blockStack.peek() < height)) {
				blockStack.push(height);
				countRectangles++;
			}
			
		}
		return countRectangles;
	}

	public static void main(String[] args) {
		int[] array = {8,8,5,7,9,8,7,4,8};
		int rectangles = countBlockNeeded(array);
		System.out.println("rectangles : " + rectangles);
	}
}
