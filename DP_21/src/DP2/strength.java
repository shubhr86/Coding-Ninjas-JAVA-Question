package DP2;

public class strength {
	
	public static int health(int grid[][]) {
		int m=grid.length;
		int n=grid[0].length;
		
		if (m==0) {
			return m;
		}
		if (n==0) {
			return n;
		}
		int storage[][] = new int [m][n];
		storage[m-1][n-1]= 1;
		storage[m-1][n-1]= 1;
		
		for (int j=n-2; j>=0;j--) {
			storage[m-1][j]= storage[m-1][j+1]-grid[m-1][j];
		}
		for (int i=m-2; i>=0;i--) {
			storage[i][n-1]= storage[i+1][n-1]-grid[i][n-1];
		}
		for (int i=m-2; i>=0;i--) {
			for (int j=n-2;j>=0; j--) {
				int op1= storage[i+1][j];
				int op2= storage[i][j+1];
				storage[i][j]=Math.max(Math.min(op1,op2), 1)-grid[i][j];	}
					
		}
		return storage[0][0];
	}
	public static void main(String[] args) {
		int grid[][]= {{0, -2, -3, 1},
			{-1, 4 ,0 ,-2},
			{1, -2, -3 ,0}};
		
		System.out.println(health(grid));
	}

}
