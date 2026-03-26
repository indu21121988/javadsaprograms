package com.test;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> res = new ArrayList<>();
		int i = 0;
		
		while(i<words.length) {
			int j = i+1;
			int linelength = words[i].length();
			
			//find words for the current line
			while(j<words.length && linelength + 1 + words[j].length() <= maxWidth) {
				linelength += 1 + words[j].length();
				j++;		
			}
			
			
		}
		
		
		return res;
	}

}
