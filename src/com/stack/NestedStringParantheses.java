package com.stack;

public class NestedStringParantheses {

	/*
	 * Character	Action
		(	count++ (open)
		)	count-- (close)
	 */
	public static int checkParathesesNestedValid(String str) {
		int n = str.length();
		int count = 0;
		for(char c : str.toCharArray()) {
			if(c == '(') {
				count++;
			} else {
				count--;
				if(count < 0) {
					return 0;
				}
			}
		}
		
		return count == 0 ? 1 : 0;
		
	}
	
	public static void main(String[] args) {
		String strNestedProperly = "(()(())())";
		String strNotNestedProperly = "())";
		int nestedResult = checkParathesesNestedValid(strNestedProperly);
		int notNestedResult = checkParathesesNestedValid(strNotNestedProperly);
		
		System.out.println(nestedResult);
		System.out.print(notNestedResult);
	}
}
