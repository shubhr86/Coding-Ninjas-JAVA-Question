package DP2;

public class supersequence {
	
	
	public static int superseq(String s, String t) {
		if (s.length()==0 || t.length()==0) {
			return s.length()+t.length();
		}
		if (s.charAt(0)==t.charAt(0)) {
			return 1+ superseq(s.substring(1), t.substring(1));
		}else {
			int op1= superseq(s.substring(1), t);
			int op2= superseq(s, t.substring(1));
			return 1+ Math.min(op1, op2);
		}
	}
	public static int supersequence_M(String s, String t) {
		int storage[][]= new int [s.length()+1][t.length()+1];
		for (int i=0; i<s.length()+1; i++) {
			for (int j=0;j<t.length()+1; j++) {
				storage[i][j]= -1;
			}
		}
		return supersequence_M(s, t,storage);
	}
	

	private static int supersequence_M(String s, String t, int[][] storage) {
		int m=s.length();
		int n=t.length();
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
			storage[m][n]= 1+ supersequence_M(s.substring(1), t.substring(1), storage);
		}
		else {
			int op1=supersequence_M(s, t.substring(1), storage);
			int op2=  supersequence_M(s.substring(1), t, storage);
			storage[m][n]= 1+ Math.min(op1, op2);
		}
		return storage[m][n];
	}
	public static void main(String[] args) {
		String s="ab";
		String t="bc";
		System.out.println(superseq(s, t));
		System.out.println(supersequence_M(s, t));

	}

}
