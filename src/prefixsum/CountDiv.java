package prefixsum;

public class CountDiv {
	
	/*
	 * count of numbers in given range a..b mod k
	 * b/k = count of multiples of k up to b
	 * a-1/k = count of multiples of k before a
	 */
	
	public static int countDivNumbers(int a, int b, int k) {
		if(a == 0) {
			return (b/k) + 1;
		}
		
		return (b/k) - ((a-1)/k);
	}
	
	public static void main(String[] args) {
		int count = countDivNumbers(6, 11, 2);
		System.out.println(count);
	}

}
