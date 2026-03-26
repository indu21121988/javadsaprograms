package com.test;

import java.util.HashSet;

public class PermuteArrayCheck {

    /*
    Array size = N

Every number is between 1 and N

No duplicates

If these 3 are true → it is automatically a permutation.
     */
    public static boolean checkPermutation(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int n = array.length;
        for(int i : array) {
            if(i < 0 || i > n) {
                return false;
            }
            if(set.contains(i)) {
                return false;
            }
            set.add(i);
        }
        return set.size() == n;
    }

    public static void main(String[] args) {
        int[] array = {4,1,2};
        System.out.println(checkPermutation(array));
    }
}
