package com.array;

import java.util.Arrays;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[] numArray = {1,2,3,4,5};
		int removeelement = 3;
		
		int[] result = Arrays.stream(numArray)
				.filter(a -> a != removeelement)
				.toArray();
		System.out.print(Arrays.toString(result));
	}

}
