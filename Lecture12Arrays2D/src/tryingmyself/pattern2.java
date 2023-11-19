package tryingmyself;

public class pattern2 {
	
	public static void pattern2(int n) {
		for (int i=1;i<=n;i++) {
			for (int j=1;j<n-i+2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4;
		pattern2(n);

	}

}
