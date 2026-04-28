package com.leader;

public class EqiLeader {
	
	public static int findEqiLeaderCandidate(int[] array) {
		
		int candidate = array[0];
		int count = 1;
		
		for(int i=1;i<array.length;i++) {
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
		for(int i = 0;i<array.length;i++) {
			if(array[i] == candidate) {
				frequency++;
			}
		}
		
		if(frequency <= array.length/2) {
			return -1;
		}
		
		int leader = candidate;
		int leftCount = 0;
		int equiLeaderCount = 0;
		for(int s=0;s<array.length;s++) {
			if(array[s] == leader) {
				leftCount++;
			}
			
			int leftSize = s + 1;
			int rightSize = array.length - s -1;
			
			if(leftCount > leftSize /2 && (frequency - leftCount) > rightSize / 2) {
				equiLeaderCount++;
			}
		}
		return equiLeaderCount;
	}

	public static void main(String[] args) {
		int[] testcase1leader = {4,3,4,4,4,2};
		int result1Leader = findEqiLeaderCandidate(testcase1leader);
		System.out.println("Index S : " + result1Leader);
		
		int[] testcase2noleader = {1,2,3,4};
		int resultNoLeader = findEqiLeaderCandidate(testcase2noleader);
		System.out.println("no leader : " + resultNoLeader);
		
		int[] testcase3leader = {5,5,5,5,5};
		int result2Leader = findEqiLeaderCandidate(testcase3leader);
		System.out.println(result2Leader);
	}
}
