package com.array;

import java.util.Arrays;

public class ArrayRotate {
	public static void main(String[] args) {
		int[] numArray = {1,2,5,7,4};
		ArrayRotate arrayRotate = new ArrayRotate();
	
		arrayRotate.rotateArray(numArray, 2);
		System.out.println(Arrays.toString(numArray));
	}
	
	public void rotateArray(int[] arrayNum, int k) {
		if(arrayNum == null || arrayNum.length < 2) {
			return;
		}
		
		k = k % arrayNum.length;
		
		//reverse the entire array
		reverse(arrayNum, 0, arrayNum.length-1);
		
		//reverse first k elements
		reverse(arrayNum,0,k-1);
		
		//reverse rest elements
		reverse(arrayNum, k, arrayNum.length-1);
		
	}
	
	private void reverse(int[] arrayNum, int start, int end) {
		while(start<end) {
			int temp = arrayNum[start];
			arrayNum[start] = arrayNum[end];
			arrayNum[end] = temp;
			start++;
			end--;
		}
	}

}
