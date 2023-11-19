package loop;

import java.util.Scanner;

public class ProductandSum {
	public static long sumOrProduct(int n, int q) {
		
		int sum=0;
		 long product=1;
		if (q==1) {
			
			for (int i=0;i<=n;i++) {
				sum=sum+i;
			}
			return sum;
		}else {
				if (q==2) {
					for (int i=1;i<=n;i++) {
						product=(product*i);
					}
				}
			}
		return product;
	
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int q=s.nextInt();
		
		System.out.println(sumOrProduct(n, q));
	

		

	}

}
