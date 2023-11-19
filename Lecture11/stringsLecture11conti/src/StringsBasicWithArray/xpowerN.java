package StringsBasicWithArray;

public class xpowerN {
	public static int power(int x, int n) {
		if (n==0 ) {
			return 1;
		}
		if (x==0 ) {
			return 0;
		}
		return power(x, n-1) * x;
		 
	}

	public static void main(String[] args) {
		int x=2;
		int n=6;
		System.out.println(power(x, n));

	}

}
