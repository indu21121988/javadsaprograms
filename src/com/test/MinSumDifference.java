package com.test;

public class MinSumDifference {

    public static int findMinSumDifference(int[] array) {
        int totalsum = 0;
        int minDiff = Integer.MAX_VALUE;

        for(int i : array) {
            totalsum+=i;
        }
        int leftSum = 0;
        for(int i =0;i<array.length;i++) {
            leftSum =  leftSum + array[i];
            int rightSum = totalsum - leftSum;
            int difference = Math.abs(rightSum - leftSum);
            if(difference < minDiff) {
                minDiff = difference;
            }
        }
        return  minDiff;
    }

    public static void main(String[] args) {
        int[] array = {3,1,2,4,3};
        int mindiff = findMinSumDifference(array);
        System.out.println(mindiff);
    }
}
