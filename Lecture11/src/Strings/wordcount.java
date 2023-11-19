package Strings;

import java.util.Scanner;

public class wordcount {
	
	public static int countWords(String str) {	
		//Your code goes here
        int count = 0;
        
        if(str.length() == 0){return 0;}
        
        String[] ans = str.split(" ");
        return ans.length;
	}

	public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
		
		String Str=s.nextLine();
		
		int k=countWords(Str);
		
		System.out.println(k);

	}

}
