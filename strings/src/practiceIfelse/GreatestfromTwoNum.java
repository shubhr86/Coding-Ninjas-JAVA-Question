package practiceIfelse;

import java.util.Scanner;

public class GreatestfromTwoNum {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Put The 1st Num");
		int n=s.nextInt();
		System.out.println("Put The 2nd Num");
		int b=s.nextInt();
		if (n<b) {
			System.out.println("Greatest Number Is: "+b);

		}else {
			if (b<n) {
				System.out.println("Greatest Number Is: "+n);
		} else {
			if (n==b) {
				System.out.println("Greatest Number Is: "+b);
		}

	}

}
	}
}

