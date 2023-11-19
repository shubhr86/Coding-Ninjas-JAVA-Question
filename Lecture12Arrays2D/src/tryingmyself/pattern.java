package tryingmyself;

public class pattern {
	
	public static void pattern1(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4;
		pattern1(n);

	}

}
