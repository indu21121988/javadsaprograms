package com.test;

import java.util.Arrays;

public class RightRotationOfArray {

    public static int[] rotateArray(int[] array, int k) {
        int n = array.length;
        if(n == 0) {
            return array;
        }
        k = k % n;
        int[] result = new int[n];
        for(int i=0;i<n;i++) {
            result[(i+k) % n] = array[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int[] rotatedArray = rotateArray(array, 2);
        System.out.print(Arrays.toString(rotatedArray));
    }
}
