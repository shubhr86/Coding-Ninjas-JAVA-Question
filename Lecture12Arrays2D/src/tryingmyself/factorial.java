package tryingmyself;

import java.util.Scanner;

public class factorial {
	
	public static void factorial1(int fact) {
		int ans=1;
		
		for (int i=1;i<=fact;i++) {
			ans= ans*i;
			
		} 
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int fact=s.nextInt();
		factorial1(fact);;

	}

}
