package Basic;

import java.net.Socket;

public class fibonnaci {
	
	// Memoization Technique
	
	public static int fib(int n) {
		int storage[]= new int [n+1];
		for (int i=0; i<=n; i++) {
			// adding -1 to every null space
			storage[i] = -1;
		}
		return fib(storage, n);
	}
	
	public static int fib(int storage[], int n) {
		if (n ==0 || n==1) {
			storage[n]=n;
			return storage[n];
		}
		if (storage[n] != -1) {
			return storage[n];
		}
		storage[n]= fib(storage, n -1) + fib(storage, n -2);
		return storage[n];
	}

	public static void main(String[] args) {
		int n= 44;
		System.out.println(fib(n));

	}

}
