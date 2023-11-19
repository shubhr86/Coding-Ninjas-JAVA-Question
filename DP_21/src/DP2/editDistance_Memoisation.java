package DP2;

public class editDistance_Memoisation {
	
	public static int memoisation(String s, String t) {
		
		int m=s.length();
		int n= t.length();
		int storage[][]= new int [m+1][n+1];
		for (int i=0;i<m +1;i++) {
			for (int j=0; j<n+1;j++) {
				storage[i][j]=-1;
			}
		}
		return ed(s,t,storage);
	}

	private static int ed(String s, String t, int[][] storage) {
		int m=s.length();
		int n= t.length();
		if (m==0) {
			storage[m][n]=n;
			return storage[m][n];
		}
		if (n==0) {
			storage[m][n]=m;
			return storage[m][n];
		}
		if (storage[m][n]!=-1) {
			return storage[m][n];
		}
		if (s.charAt(0)==t.charAt(0)) {
			storage[m][n]= ed(s.substring(1), t.substring(1), storage);
			 
		}else {
			// insert
			int op1= ed(s, t.substring(1), storage);
			// delete
			int op2= ed(s.substring(1), t, storage);
			// Subsequence
			int op3= ed(s.substring(1), t.substring(1), storage);
			storage[m][n]= 1+ Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];
		
	}
	
	public static int edby_DP(String s, String t) {
		int m=s.length();
		int n= t.length();
		int storage[][]= new int [m+1][n+1];
		for (int i=0;i<=m;i++) {
			storage[i][0]=i;
		}
		for (int j=0;j<=n;j++) {
			storage[0][j]=j;
		}
		for (int i=1;i<=m;i++) {
			for (int j=1;j<=n;j++) {
				if (s.charAt(i-1)==t.charAt(j-1)) {
					storage[i][j]= storage[i-1][j-1];
				}else {
					storage[i][j]=1+ Math.min(storage[i][j-1], 
							Math.min( storage[i-1][j],storage[i-1][j-1]));
					
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		String s= "adefh";
		String t= "gbdebb";
		System.out.println(memoisation(s, t));
		System.out.println(edby_DP(s, t));


	}

}
