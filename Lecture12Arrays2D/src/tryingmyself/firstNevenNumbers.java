package tryingmyself;

import java.util.Scanner;

public class firstNevenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		int i=0;
		int sum=0;
		while ( i<=n) {
			sum= sum + (2*i); // for making sum use shortcut for even numbers 2*i and for odd 2*i+1
			i++;
		}
		System.out.print(sum);

	}

}
