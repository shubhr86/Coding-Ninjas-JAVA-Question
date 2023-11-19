package Recursionssignment;

public class subseqence {
	
	public static void sub(String str, int startindex, String newstring) {
		// base case 
		if (startindex==str.length()) {
			System.out.println(newstring);
			return;
		}
		// take char as new varibale
		char currentchar= str.charAt(startindex);
		sub(str, startindex +1, newstring + currentchar);
		
		sub(str, startindex +1, newstring);
		
	}
			
	public static String[] subsequence(String str) {
		
		return subsequence(str);
		
	}


	public static void main(String[] args) {
		String str="xyz";
		
		sub(str, 0, "");

	}

}
