package DP2;

public class LCS_M {
	
	public static int lcsM(String s, String t) {
		int storage[][]= new int [s.length()+1][t.length()+1];
		
		for (int i=0; i<s.length()+1;i++) {
			for (int j=0; j<t.length()+1; j++) {
				storage[i][j]= -1;
			}
			
		}
		return lcsM(s, t,storage);
	}

	private static int lcsM(String s, String t, int[][] storage) {
		int m=s.length();
		int n= t.length();
		
		if (m==0 || n==0) {
			storage[m][n]= 0;
			return storage[m][n];
		}
		if (storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(s.charAt(0)== t.charAt(0)) {
			storage[m][n]= 1+ (lcsM(s.substring(1), t.substring(1),storage));
			
		}else {
			int op1= lcsM(s.substring(1), t,storage);
			int op2= lcsM(s, t.substring(1),storage);
			storage[m][n]= Math.max(op1, op2);
			
		}
		return storage[m][n];
	}
	
	
	public static int lcs_Dp(String s, String t) {
		int m= s.length();
		int n= t.length();
		int storage[][]= new int [m+1][n+1];
		for (int i=0; i<=m; i++) {
			storage[i][0]=0;
		}
		for (int i=0; i<=n; i++) {
			storage[0][i]=0;
		}
		for (int i=1; i<=m;i++) {
			for (int j=1;j<=n;j++) {
				if (s.charAt(i-1)==t.charAt(j-1)) {
					storage[i][j]=1+storage[i-1][j-1];
					
				}else {
					storage[i][j]= Math.max(storage[i][j-1],storage[i-1][j]);
				}
			}
		}
		
		return storage[m][n];
	}
	

	public static void main(String[] args) {
		String s= "adef";
		String t= "eaf";
		System.out.println(lcsM(s, t));
		System.out.println(lcs_Dp(s, t));


	}

}
