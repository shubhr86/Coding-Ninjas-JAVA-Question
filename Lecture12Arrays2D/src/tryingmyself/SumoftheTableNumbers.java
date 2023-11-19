package tryingmyself;

import java.util.Scanner;

public class SumoftheTableNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		 for (int i=1;i<=10;i++) {
			 
			 sum= sum+(n*i);                    // Calculating sum 
			
			 
		 }
		 System.out.println(sum);

	}

}
