package Strings;

import java.util.Scanner;

public class StringInputOutputChar {
	public static void PrintChar(String Str){
		// to travel every Char need to use loop
		
		for (int i=0;i<Str.length();i++) {
			System.out.print(Str.charAt(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		
		String Str=s.nextLine();
		
	  PrintChar(Str);
		
	}

}
