package prefixsum;

public class MinAvgTwoSlice {

	/*
	 * A non-empty array A consisting of N integers is given. A pair of integers (P, Q), 
	 * such that 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements).
	 *  The average of a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice.
	 *   To be precise, the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1)
	 */
	public static int findMinimumAvgTwoSlice(int[] A) {
		int n = A.length;
		int minIndex = 0;
		double minAvg = Double.MAX_VALUE;
		
		for(int i =0;i<n-1;i++) {
			//slice 2
			double avg2 = (A[i] + A[i+1]) / 2.0;
			if(avg2 < minAvg) {
				minAvg = avg2;
				minIndex = i;
			}
			
			//slice 3
			if(i < n-2) {
				double avg3 = (A[i] + A[i+1] + A[i+2]) /3.0;
				if(avg3 < minAvg) {
					minAvg = avg3;
					minIndex = i;
				}
			}
			
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
		int[] array = {4,2,2,5,1,5,8};
		int minAvg = findMinimumAvgTwoSlice(array);
		System.out.print(minAvg);
	}
	
}
