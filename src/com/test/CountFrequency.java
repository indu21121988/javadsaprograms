package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CountFrequency {
 
	public static void main(String[] args) {
		String str = "hello world";
		
		Map<Character, Long> map = str.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.print(map);
		
		Map<Character, Integer> map2 = new HashMap();
		
		for(char c : str.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		System.out.print(map2);
	}
}
