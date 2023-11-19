package selftest;

import java.util.Scanner;

public class Toeplitiz {
	
	public static boolean isToepliz(int mat[][], int N, int M){

			for(int i=0; i<N -1; i++) {
				for (int j =0; j<M-1; j++) {
					if (mat[i][j] == mat[i+1][j+1]) {
						return true;
					}
				}
			}
			return false;
	}

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T= s.nextInt();
		 while (T > 0) {
			 int n = s.nextInt();
			 int m = s.nextInt();
			 int arr[][]= new int [n][m];
			 for (int i=0 ; i<n; i++) {
				 for (int j=0; j< m; j++) {
					 arr[i][j]= s.nextInt();
				 }
				 Toeplitiz ans= new Toeplitiz();
				 boolean b = ans.isToepliz(arr, n, m);
				 if (b ==false) {
					 System.out.println(0);
				 }else {
					 System.out.println(1);
					 T--;
				 }
			 }
				
		 }

	}

}
