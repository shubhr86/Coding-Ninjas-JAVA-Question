package selftest;

public class sumofSeries {
	
	public static long sum(int n) {
//		int sum =n; 
//		int i =0;
//		while (i<n) {
//			sum=sum+i;
//			i++;
//		}
//		return sum;
		
		
		// better time complexity if Input is big
		
		long sum =0;
		sum = (long) n*(n+1)/2;
	    return sum;
		
	}

	public static void main(String[] args) {
		int n =30158;
		System.out.println(sum(n));

	}

}
