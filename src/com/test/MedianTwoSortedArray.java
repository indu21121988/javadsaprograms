package com.test;

public class MedianTwoSortedArray {

    /* dry run
    array1 = [1,2]
    array2 = [3,4]

    left side size = array1.length + array2.length + 1 /2
                        2 + 2 /2 = 2

     low = 0, high = 2

    partitionX = low + high /2
                    0 + 2 /2 = 1 (means array1[1,|2]
    partitionY = left side size - partitionX
                    2 - 1 = 1 (means array2[3,|4]

    maxLeftx = 1
    minRightx = 2

    maxLefty = 3
    minRighty = 4

    maxLeftx <= minRightY 1 <= 4 true
    maxLefty <= minRightx 3 <= 2 false

    second condition false we need to move on left side of num1
    low = partitionX + 1
           1 + 1 = 2
     high = 2

     partitionX = low + high /2
                       2 + 2 /2 = 2
     partitionY = left side size - partitionX
                    2 - 2 = 0
     new partition array1[1,2,|]
                   array2[|,3,4]
     maxLeftx = 2
     minRightx = end of array
     maxLefty = start of array
     minRighty = 3

     maxLeftx <= minRighty   2 <= 3 true
     maxLefty <= minRightx start of arrya <= end of array true

     correct partition found
     total element are 4 which is even
     Median = (max(maxLeftx, maxLefty) + max(minRightx, minRighty)) / 2
                max(2,start of array) + max(end of array, 3) /2
                2 + 3 /2
                5/2 = 2.5

      if total length odd
            Median = max(maxLeftx, maxLefty)

     */
    public static double findMedianOfTwoArray(int[] array1, int[] array2) {

        if(array1.length > array2.length) {
            return findMedianOfTwoArray(array1, array2);
        }
        int m = array1.length;
        int n = array2.length;
        int low = 0;
        int high = m;

        while(low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) /2 - partitionX;

            int maxLeftx = (partitionX == 0) ? Integer.MIN_VALUE : array1[partitionX - 1];
            int minRightx = (partitionX == m) ? Integer.MAX_VALUE : array1[partitionX];

            int maxLefty = (partitionY == 0) ? Integer.MIN_VALUE : array2[partitionY - 1];
            int minRighty = (partitionY == n) ? Integer.MAX_VALUE : array2[partitionY];

            //correct partition found
            if(maxLeftx <= minRighty && maxLefty <= minRightx) {
                //even total length
                if((m + n) % 2 == 0) {
                    return (Math.max(maxLeftx, maxLefty) +
                            Math.min(minRightx, minRighty)) / 2.0;
                }

                //odd total length
                else {
                    return Math.max(maxLeftx, maxLefty);
                }
            }   // move left
                else if(maxLeftx > minRighty) {
                high = partitionX - 1;
            }   // move right
                else {
                    low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException("arrays are not sorted");
    }

    public static void main(String[] args) {
        int[] array1 = {1,2};
        int[] array2 = {3,4};
        double median = findMedianOfTwoArray(array1, array2);
        System.out.print(median);
    }


}
