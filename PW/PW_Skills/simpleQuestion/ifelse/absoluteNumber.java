package ifelse;

import java.util.*;

public class absoluteNumber {
	
//	Write a program to print absolute vlaue of a number entered by user. E.g.-
//	INPUT: 1        OUTPUT: 1
//	INPUT: -1        OUTPUT: 1
	
	public static void printabsoluteNumber() {
		Scanner s = new Scanner(System.in);
			int a= s.nextInt();
			
			if (a<0) {
				System.out.println("Absolute Number: "+ (-1*(a)));
			}else {
				System.out.println("Absoluite Number: "+a);
			}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printabsoluteNumber();

	}

}
