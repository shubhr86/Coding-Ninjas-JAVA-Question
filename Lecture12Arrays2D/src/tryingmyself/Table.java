package tryingmyself;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n =s.nextInt();
		
	
		for (int i=1;i<=10;i++) {
			
			System.out.println(n+"x"+i+"="+(n*i));
		}
	}

}
