package DP2;

public class knapvalue {
	
	public static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		
		return knapsack(weight, value, n, maxWeight,0);
		
	}

		

	private static int knapsack(int[] weights, int[] values, int n, int maxWeight, int i) {
		if (weights.length==i || maxWeight==0) {
			return 0;
		}
		
		
		if (weights[i] > maxWeight) {
			// next weight items and value would we pick for that we also remove n
			return knapsack(weights, values, n-1, maxWeight,i+1);
		}else {
			// include into bag
			
			
			int op2= values[i]+knapsack(weights, values, n, maxWeight-weights[i],i+1);
			// not include into bag
			int op3= knapsack(weights, values, n-1, maxWeight,i+1);
			return Math.max(op2, op3);
		}
	}
	
	public static int knapsack_M(int[] weights, int[] values, int n, int maxWeight) {
		int storage[][] = new int [n+1][maxWeight+1];
		for (int j=0; j<weights.length+1; j++) {
			for (int i=0;i<maxWeight+1;i++) {
				storage[j][i]=-1;
			}
			
					
		}
		return knapsack_Mhelper(weights, values, n, maxWeight, 0,storage);
	}



	private static int knapsack_Mhelper(int[] weights, int[] values, int n, int maxWeight, int i,int storage[][]) {
		
		
		if ( i==weights.length || maxWeight==0) {
			storage[i][maxWeight]=0;
			return storage[i][maxWeight];
		}
		if (storage[i][maxWeight]!=-1) {
			return storage[i][maxWeight];
		}
		if (weights[i] > maxWeight) {
			storage[i][maxWeight]= knapsack_Mhelper(weights, values, n-1, maxWeight,i+1,storage);
		}
		
		else {
			int op1= values[i] + knapsack_Mhelper(weights, values, n, maxWeight-weights[i], i+1,storage);
			int op2= knapsack_Mhelper(weights, values, n-1, maxWeight, i+1,storage);
			storage[i][maxWeight]= Math.max(op1, op2);
		}
		return storage[i][maxWeight];
	}

//	public static int knapsack_DP(int[] weights, int[] values, int n, int m) {
//		
//		int storage[][] = new int [n+1][m+1];
//		
//		for (int i=n-1;i>=0;i--) {
//			for (int j=0;j<=n;j++) {
//				int ans;
//				if (weights[i] > m) {
//					ans= storage[i+1][m];
//				}else {
//					int ans1= values[i]+storage[i+1][m-weights[i]];
//					int ans2= storage[i+1][m];
//					ans= Math.max(ans1, ans2);
//				}
//				storage[i][m]= ans;
//				
//			}
//			
//		}
//		return storage[0][m];
//		
//	}
	public static int knapsack_DP(int[] weights, int[] values, int n, int m) {
	    int storage[][] = new int[n + 1][m + 1];

	    for (int i = n - 1; i >= 0; i--) {
	        for (int j = 0; j <= m; j++) {
	            int ans;
	            if (weights[i] > j) {
	                ans = storage[i + 1][j];
	            } else {
	                int ans1 = values[i] + storage[i + 1][j - weights[i]];
	                int ans2 = storage[i + 1][j];
	                ans = Math.max(ans1, ans2);
	            }
	            storage[i][j] = ans;
	        }
	    }
	    return storage[0][m];
	}
		
	
		
			
	

	public static void main(String[] args) {
		int weights[]= {9 ,8, 1 ,9  };
		int values[]= {6,10,8,8 };
		int n =4;
		int max=16;
		System.out.println(knapsack(weights, values, n, max));
		System.out.println(knapsack_M(weights, values, n, max));
		System.out.println(knapsack_DP(weights, values, n, max));
	}

}
