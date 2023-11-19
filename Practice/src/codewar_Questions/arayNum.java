package codewar_Questions;

public class arayNum {
	
	public static int [] num( int x, int n) {
		int arr[] = new int[n];
		for (int i=0; i<n;i++) {
			arr[i]= x*(i+1);
		}		
		return arr;
	}

	public static void main(String[] args) {
		int x = 2;
		int n=5;
		
		System.out.println(num(x, n));
	}

}
