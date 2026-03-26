package com.test;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverCross {

    public static int findLeastSecond(int[] array, int x) {
        Set<Integer> positions = new HashSet<>();

        for(int i =0;i<array.length;i++) {
            if(array[i] <= x) {
                //add position only if new
                positions.add(array[i]);
            }

            if(positions.size() == x) {
                //all positions are covered
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,3,1,4,2,3,5,4};
        int x = 5;
        int earliestSecond = findLeastSecond(array, x);
        System.out.println(earliestSecond);
    }
}
