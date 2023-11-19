package Recursionssignment;

import tryingmyself.maxandMin;

public class printkeyboard {
	
	public static String [] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static void print(String str, int index, String newstring) {
		// base case 
		if (index==str.length()) {
			System.out.println(newstring);
			return;
		}
		char currentchar= str.charAt(index);
		String mapping= keypad [currentchar-'0'];
		for (int i=0; i<mapping.length();i++) {
			print(str, index + 1, newstring+ mapping.charAt(i));
		}
	}
	
	public static void printkeyboard(int input) {
		String newstring=" ";
		print("", input, "");
	}

	public static void main(String[] args) {
		String str="23";
		print(str, 0, "");
	}

}
