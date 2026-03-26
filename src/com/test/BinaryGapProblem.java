package com.test;

public class BinaryGapProblem {

    public static void main(String[] args) {
        int maximumGap = findBinaryGap(32);
        System.out.print(maximumGap);

    }

    public static int findBinaryGap(int number) {
        int currentGap = 0;
        int maxGap = 0;
        while (number > 0){
            if((number & 1) == 1) {
                maxGap = Math.max(maxGap, currentGap);
                currentGap = 0;
            } else {
                currentGap++;
            }
            number >>= 1;
        }
        return maxGap;
    }
}
