package tryingmyself;

public class multiplication {
	
	public static int multiply(int n) {
		if (n==0) {
			return 0;
		} int product = multiply(n-1)+n;
		return product;
		
	}

	public static void main(String[] args) {
		int n =3;
		System.out.println(multiply(n));

	}

}
