package stringsPractice;

import java.util.Scanner;

public class findStringLength {
	
	public static void lengthofString() {
		Scanner s= new Scanner (System.in);
		String str= s.nextLine();
		int length= str.length();
		System.out.print("Length of String: ");
		System.out.println(length);
	}

	public static void main(String[] args) {
		
		lengthofString();
		

	}

}
