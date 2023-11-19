package tryingmyself;

import java.util.Scanner;

public class product {
	
	public static void product(int x, int y) {
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		product(x, y);

	}

}
