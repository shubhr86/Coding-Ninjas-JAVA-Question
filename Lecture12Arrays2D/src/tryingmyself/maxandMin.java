package tryingmyself;

import java.util.Scanner;

public class maxandMin {
	
	public static void maxnum(int n, int m, int o) {
		System.out.println("Maximum Number Is: ");
		if (n>=m && n>=o) {
			System.out.println(n);
		} else if (m>=n && m>=o) {
			System.out.println(m);
			
		}else {
			System.out.println(o);
		}
	}
	public static void minnum(int n, int m, int o) {
		System.out.println("Minimum Number Is: ");
		if (n<=m && n<=o) {
			System.out.println(n);
		} else if (m<=n && m<=o) {
			System.out.println(m);
			
		}else {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num1= s.nextInt();
		int num2= s.nextInt();
		int num3 = s.nextInt();
		
		maxnum(num1, num2, num3);
		minnum(num1, num2, num3);
				

	}

}
