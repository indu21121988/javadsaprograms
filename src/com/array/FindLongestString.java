package com.array;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestString {
	
	public static void main(String[] args) {
		String[] days = {"monday", "tuesday", "wednesday"};
		
		String longestStr = days[0];
		for(String str : days) {
			if(str.length() > longestStr.length()) {
				longestStr = str;
			}
		}
		System.out.println("longest str : " + longestStr);
		
		//with java8
		
		String longstr = Arrays.stream(days)
						.max(Comparator.comparingInt(String::length))
						.orElse("");
		
		System.out.println("longstr : " + longstr);
		
	}

}
