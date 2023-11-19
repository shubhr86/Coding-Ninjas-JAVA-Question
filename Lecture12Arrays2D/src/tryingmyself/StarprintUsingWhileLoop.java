package tryingmyself;

import java.util.Scanner;

public class StarprintUsingWhileLoop {

	
		public static void main(String[] args) {
			
			Scanner s =new Scanner (System.in);
			int n=s.nextInt();
			int i=0;
			i=n;
			while (i>0) {
				i--;
				int j=0;
				while (j<=i) {
					
				j++;
				
					
					System.out.print("*");
					
				}
			System.out.println();
				
			}
			
			

	}
}


