package tryingmyself;

import java.util.Scanner;

public class factorialofNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n =s.nextInt();
		int i=1;
		int factorial = 1;
		while (i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println(factorial);
	}

}
