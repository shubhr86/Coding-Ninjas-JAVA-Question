package tryingmyself;

import java.util.Scanner;

public class evenorodd {
	
	public static void evenorOdd(int n) {
		if (n%2==0) {
			System.out.println(n+" Is an even Number");
		} else {
			System.out.println(n+" Is an Odd Number");
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n = s.nextInt();
		evenorOdd(n);

	}

}
