package com.test;

public class FindMissingElement {

    /*
    Formula for Sum of First k Natural Numbers
    k * (k+1) /2

    apply formula in our case we have numbers 1 to N+1
    k = N=1
    (N+1) * (N+2) / 2

    A = 2,3,1,5
    N = 4
    actual sum is
    2+5 = 7
    3+1 = 4

    7+4 = 11

    expected sum is
    11 + N
    11 + 4 = 15

    e.g. 2
    A = 4,5,2,1
    N = 4
    4 + 1 = 5
    5 + 2 = 7

    K * (K+1) /2
    k = N+1
    N+1 * (N+2) /2
    5 * (4+2) /2
    5*6 /2
    30/2 = 15

    5+7 = 12
    15 - 12 = 3


     */

    public static int missingElement(int[] array) {
        int n = array.length;
        long expectedSum = (n+1) * (n+2) / 2;
        long actualSum = 0;
        for(int i : array) {
            actualSum+=i;
        }
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        int[] array = {4,5,2,1};
        int missingNumber = missingElement(array);
        System.out.println(missingNumber);
    }
}
