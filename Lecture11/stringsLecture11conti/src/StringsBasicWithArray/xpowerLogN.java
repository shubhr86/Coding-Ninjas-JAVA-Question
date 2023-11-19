package StringsBasicWithArray;

public class xpowerLogN {
	
	public static int  xpowerlogN(int x, int n) {
		if (n==0) {  //base case 1
			return 1;
		}
		if (x==0) {  // base case 2
			return 0;
		}
		
		if (n%2==0) {  // if n is even
			return xpowerlogN(x, n/2) * xpowerlogN(x, n/2);
		} else {  // if n is odd
			return xpowerlogN(x, n/2) * xpowerlogN(x, n/2) * x;
		}
		
	}

	public static void main(String[] args) {
		int x=2;
		int n=3;
		System.out.println(xpowerlogN(x, n));

	}

}
