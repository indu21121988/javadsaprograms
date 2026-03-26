package com.sort;

public class QuickSort {
	
	//Quick Sort is an efficient, divide-and-conquer sorting algorithm that works by selecting 
	//a "pivot" element and partitioning the array around it. After partitioning, 
	// the pivot is in its final sorted position, with all smaller elements to its left and all larger elements to its right. 
	
	public static void main(String[] args) {
		
		int[] numArray = {2,4,1,8};
		int low = numArray[0];
		int high = numArray[numArray.length-1];
		
		for(int i=1;i<numArray.length-1;i++) {
			int pivot = numArray[high];
			
		}
		
	}
	
	public static void sort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);
			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
		
	}
	
	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low-1);
		for(int j=low;j<high;j++) {
			if(array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}

}
