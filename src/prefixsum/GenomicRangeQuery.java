package prefixsum;

import java.util.Arrays;

public class GenomicRangeQuery {

	/*
	 * DNA sequence
	 *A DNA sequence can be represented as a string consisting of the letters 
	 *A, C, G and T, which correspond to the types of successive nucleotides in the sequence. 
	 *Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have
	 * impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: 
	 * What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
	 *
	 * 
	 */
	public static int[] findMinimumFactorArray(String s, int[] p, int[] q) {
		int m = p.length;
		int n = s.length();
		
		int[] prefixA = new int[n+1];
		int[] prefixC = new int[n+1];
		int[] prefixG = new int[n+1];
		
		for(int i=0;i<n;i++) {
			char ch = s.charAt(i);
			prefixA[i+1] = prefixA[i] + (ch == 'A' ? 1 : 0);
			prefixC[i+1] = prefixC[i] + (ch == 'C' ? 1 : 0);
			prefixG[i+1] = prefixG[i] + (ch == 'G' ? 1 : 0);
		}
		
		int[] result = new int[m];
		for(int i=0;i<m;i++) {
			int start = p[i];
			int end = q[i]+1;
			if(prefixA[end] - prefixA[start] > 0) {
				result[i] = 1;
			} else if(prefixC[end] - prefixC[start] > 0) {
				result[i] = 2;
			} else if(prefixG[end] - prefixG[start] > 0) {
				result[i] = 3;
			} else {
				result[i] = 4;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		String s = "CAGCCTA";
		int[] p = {2,5,0};
		int[] q = {4,5,6};
		int[] output = findMinimumFactorArray(s, p, q);
		System.out.print(Arrays.toString(output));
	}
}
