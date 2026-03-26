package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUnpairedElement {

    public static List<Integer> findUnpairedElement(int[] array) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {4,6,8,3,4,6};
        List<Integer> unpairedElements = findUnpairedElement(array);
        for(int i : unpairedElements) {
            System.out.println(i);
        }
    }
}
