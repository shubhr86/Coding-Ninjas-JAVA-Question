package Recursionssignment;

public class printsubsequence {
	
	public static void printsubsequence(String str, String newstring) {
		// base case 
		if (str.length()==0) {
			System.out.println(newstring);
			return;
		}
		// we add 1st char
		printsubsequence(str.substring(1), newstring+ str.charAt(0));
		// when we not to add char
		printsubsequence(str.substring(1), newstring);
	}
	
	public static void  subseuence(String str) {
		 printsubsequence(str, "");
	}

	public static void main(String[] args) {
		String str="xyz";
		printsubsequence(str, "");

	}

}
