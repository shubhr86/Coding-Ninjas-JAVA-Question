package Naturalnumber;

public class multiply {
	
	public static int multiplyTwoIntegers(int m, int n){
		if (m==0 || n==0) {
			return 0;
		}
		return multiplyTwoIntegers(m, n-1) +m;
	}

		

	public static void main(String[] args) {
		int m= 9;
		int n= 6;
		System.out.println(multiplyTwoIntegers(m, n));
				

	}

}
