package loop;

import java.util.Scanner;

public class take10INTandPrint {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n=s.nextInt();
		int sum=0;
		for (int i=n;i<10;i++) {
			sum=sum+s.nextInt();
			
		}
		System.out.println(sum);
	}
}
