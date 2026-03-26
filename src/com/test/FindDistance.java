package com.test;

public class FindDistance {

    /*

     */
    public static int findNumberDistance(int x, int y, int d) {
        if(x >= y) {
            return 0;
        } else {
            int a = (y -x + d -1) / d;
            System.out.println("a : " + a);
           return (y-x+d-1) / d;
        }
    }

    public static void main(String[] args) {
        int distance = findNumberDistance(10, 75, 30);
        System.out.println(distance);
    }
}
