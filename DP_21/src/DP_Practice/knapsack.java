package DP_Practice;

public class knapsack {

	public static int knap (int weight[], int [] values, int maxweight, int n) {
	
		int storage[][] = new int[n+1] [maxweight+1];
		for (int i=0; i<weight.length+1; i++) {
			for(int j=0; j<maxweight+1; j++) {
				storage[i][j] = -1;
			}
		}
		return knap_M(weight, values, maxweight , 0, n,storage);
	}

	private static int knap(int[] weight, int[] values, int maxweight, int i, int n) {
		if (weight.length==i || maxweight==0) {
			return 0;
		}

		if (weight[i] > maxweight) {
			// next weight items and value would we pick for that we also remove n
			return knap(weight, values, maxweight,i+1, n-1);
		}else {
			// include into bag
			
			
			int op2= values[i]+knap(weight, values, maxweight-weight[i],i+1, n);
			// not include into bag
			int op3= knap(weight, values, maxweight,i+1, n-1);
			return Math.max(op2, op3);
		}
	}
	private static int knap_M(int[] weight, int[] values, int maxweight, int i, int n, int storage[][]) {
		
		
		if (weight.length==i || maxweight==0) {
			storage[i][maxweight]=0;
			return storage[i][maxweight];
		}
		if (storage[i][maxweight]!= -1) {
			return storage[i][maxweight];
		}
		if (weight[i] > maxweight) {
			storage[i][maxweight]= knap_M(weight, values, maxweight, i+1, n-1, storage);
		}else {
			int op1=  knap_M(weight, values, maxweight, i+1, n-1, storage);
			int op2= values[i]+ knap_M(weight, values, maxweight-weight[i], i+1, n, storage);
			storage[i][maxweight]= Math.min(op1, op2);
		}
		return storage[i][maxweight];

	}

	public static void main(String[] args) {
		int weight[]= {1,3,4,6};
		int values[]= {20,30,10,50};
		int maxweight= 10;
		int n=4;
		System.out.println(knap(weight, values, maxweight,n));
		

	}

}
