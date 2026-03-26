package com.test;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    /*
    Given a string s, find the length of the longest substring without duplicate characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

sliding window

---logic here is--
We move right forward step by step.

If everything inside window is unique → keep expanding.

If duplicate appears → move left forward until duplicate is removed.

character → last index seen

So when we see a duplicate:

Instead of removing one-by-one,
we jump the left pointer directly.
     */

    public static int longestSubstringLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLength = 0;
        for(int right =0;right < s.length();right++) {
            char current = s.charAt(right);
            if(map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }
            map.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLenthgsubstring = longestSubstringLength(str);
        System.out.print(maxLenthgsubstring);
    }


}
