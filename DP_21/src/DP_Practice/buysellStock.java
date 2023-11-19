package DP_Practice;

public class buysellStock {
	
	public static int findMaximumProfit(int[] X, int[] Y)
	{
	int m=X.length-1;
		return findMaximumProfit(X, Y, m);
	}

	private static int findMaximumProfit(int[] x, int[] y, int m) {
		
		if ( m < 0) {
			return 0;
		}
		int sum=0;

		sum= Integer.max(sum, x[m]) + findMaximumProfit(x, y, m -1);
		sum= Integer.max(sum, y[m]) + findMaximumProfit(x, y, m -2);
		
		return sum;
		
		}
	

	public static void main(String[] args) {
		int x[]= {5,3,4,6,3};
		int y[]= {8,4,3,5,10};
		System.out.println(findMaximumProfit(x, y));

	}

}
