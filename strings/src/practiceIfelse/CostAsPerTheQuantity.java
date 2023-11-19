package practiceIfelse;

import java.util.Scanner;

public class CostAsPerTheQuantity {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("What Is The Quantity ?");
		int q=s.nextInt();
		int cost = (q*100);
		int discount = (cost*10)/100;
		if (cost>1000) {
			int k = cost-discount;
			System.out.println("Your Cost With Discount: "+k);
		} else {
			System.out.println("Your Cost: "+ cost);
		}

	}

}
