package Basic;

public class minSqaureItterative {
	
	public static int minsqaure(int n) {
		int dp[] = new int [n+1];
		dp[0]=0;
		for (int i=1; i<=n; i++) {
			
			int minAns= Integer.MAX_VALUE;
			for (int j=1;j*j<=i;j++) {
				int currentAns=dp[i-(j*j)];
				if (minAns>currentAns) {
					minAns= currentAns;
				}
			}
			dp[i]=1+minAns;
		}
		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(minsqaure(41));

	}

}
