package StringsBasicWithArray;

public class factorial {
	
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		} return factorial(n-1)*n;
	}

	public static void main(String[] args) {
		int n=3;
		System.out.println(factorial(n));

	}

}
