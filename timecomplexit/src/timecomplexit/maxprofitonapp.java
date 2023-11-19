package timecomplexit;

import java.util.Arrays;

public class maxprofitonapp {
	
	public static int maximumProfit(int budget[]) {
		int ans =Integer.MIN_VALUE;
		int n=budget.length;
		Arrays.sort(budget);
		for (int i=0;i<n;i++) {
			ans= Math.max(ans, budget[i] * (n-i));
		}
		return ans;
	}


	public static void main(String[] args) {
		int [] budget= {30 ,20, 53 ,14};
		System.out.println(maximumProfit(budget));

	}

}
