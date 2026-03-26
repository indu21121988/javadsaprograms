package com.test;

import java.util.*;

public class TwoSum {

    /*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
     */

    public static void main(String[] args) {
        int[] array = {2,7,3,4};
        List<int[]> output = sumTwoNumbers(array, 9);
        for(int[] arr : output) {
            System.out.println("index : " + Arrays.toString(arr));
        }
    }

    public static List<int[]> sumTwoNumbers(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int output = target - array[i];
            if (map.containsKey(output)) {
                list.add(new int[]{map.get(output), i});
                return list;
            }
            map.put(array[i], i);
        }
        return null;
    }
}
