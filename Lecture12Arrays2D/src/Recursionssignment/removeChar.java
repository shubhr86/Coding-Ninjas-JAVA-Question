package Recursionssignment;

public class removeChar {
	
	public static String removeA(String str) {
		//base case
		//if string is empty
		if (str.length()==0) {
			return str;
		}
		String newString=""; //takig a newstring adding char into this
		if (str.charAt(0)!='a') { // when char 0 is not a
			newString= newString + str.charAt(0); // then adding char0 into new string
		} 
		
		String ans= removeA(str.substring(1)); //start recursion from index 1 beacuse we already taken care of index 0 or char 0
		return newString + ans;
		
	}

	public static void main(String[] args) {
		String str="abahacdab";
		System.out.println(removeA(str));

	}

}
