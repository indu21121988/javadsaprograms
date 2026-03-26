package com.test;

import java.util.HashMap;
import java.util.Map;

public class kproblemsubarraysum {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int[] numbers = {1,3,5,6,7};
		int sumnumber = 9;
		
		int count = 0;
		int currentSum = 0;
		
		map.put(0, 1);
		for(int num : numbers) {
			currentSum = currentSum + num;
			
			if(map.containsKey(currentSum - sumnumber)) {
				count = count + map.get(currentSum - sumnumber);
			}
			map.put(currentSum, map.getOrDefault(currentSum, 0));
		}
		
		System.out.print(count);
		
		/*
		 int[] array = {1,3,5,6,7};
		 sum = 9
		 
	iteration	elements	currentSum	currentsum-k	is(sum-k) in map?	count(update)	map(update)(sum:fre)
		 1 		0			0			0-9 = -9		no					0				0,1
		 2		1			1			1-9 = -8		no					0				1,1	
		 3 		3			4			4-9 = -5		no					0				4,1
		 4 		5			9			9-9 = 0			yes					0+1 = 1			9,1
		 5 		6			15			15-0 = 6		no					1				15,1
		 6 		7			22			22-9 = 13		no					1				22,1
		 
		 					
		int[] array = {1,2,3} , k = 3
		1		0			0			0-3 = -3		no					0				0,1
		2 		1			1			1-3 = -2		no					0				1,1
		3 		2			3			3-3 =  0		yes					0+1 = 1			3,1
		4		3			6			6-3 = 3			yes					1+1 = 2			6,1
		
		
		int[] array = {2,6,8,7,2} , k = 8
		1		0			0			0-8 = -8		no					0				0,1		
		2		2			2			2-8 = -6		no					0				2,1
		3		6			8			8-8 = 0			yes					0+1 = 1			8,1
		4		8			16			16-8 = 8		yes					1+1 = 2			16,1
		5		7			23			23-8 = 15		no					2+0 = 2			23,1
		6		2			25			25-8 = 17		no					2+0 = 2			25,1
		 */
	}
	
	

}
