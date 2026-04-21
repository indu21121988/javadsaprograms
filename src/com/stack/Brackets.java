package com.stack;

import java.util.Stack;

public class Brackets {
	
	public static int matchBraces(String str) {
		int n = str.length();
		Stack<Character> stack = new Stack<Character>();
		for(char ch : str.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if(stack.isEmpty()) {
					return 0;
				}
				char top = stack.pop();
				
				if((ch == ')' && top != '(') ||
						(ch == '}' && top != '{') ||
						(ch == ']' && top != '[')) {
					return 0;
					
				}
		
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

	public static void main(String[] args) {
		String matchstring = "{[()()]}";
		int resultmatch = matchBraces(matchstring);
		
		String unmatchstring = "([)()]";
		int resultunmatch = matchBraces(unmatchstring);
		
		System.out.print("matchstring : " + resultmatch);
		System.out.println("unmatchstring : " + resultunmatch);
	}
}
