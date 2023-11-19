package ArrayPractce;

import java.util.Scanner;

public class sumofArrayRecursion {
	
	public static int printsum(int x) {
		
		if (x/10==0) {
		
			return x;
		}else {
			return printsum(x/10) + (x%10);
		}
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int x=s.nextInt();
		
		System.out.print(printsum(x)+" ");

	}

}
