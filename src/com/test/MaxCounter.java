package com.test;

public class MaxCounter {

    public static int[] findMaxCounterArray(int[] array, int n) {
        int[] counters = new int[n];
        int baseValue = 0;
        int currentMax = 0;

        for(int i=0;i<array.length;i++) {
            if(array[i] > 0 && array[i] <= n) {
                int index = array[i] - 1;

                if(counters[index] < baseValue) {
                    counters[index] = baseValue;
                }
                counters[index]++;
                if(counters[index] > currentMax ) {
                    currentMax = counters[index];
                }
            } else if(array[i] == n +1) {
                baseValue = currentMax;
            }

        }

        //final synchronization
        for(int i =0;i<n;i++) {
            if(counters[i] < baseValue) {
                counters[i] = baseValue;
            }
        }
        return counters;
    }

    public static void main(String[] args) {
        int[] array = {3,4,4,6,1,4,4};
        int[] result = findMaxCounterArray(array, 5);
        for(int i : result) {
            System.out.println(i);
        }
    }
}
