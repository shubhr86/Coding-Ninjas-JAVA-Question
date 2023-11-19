package Strings;

public class ReverseEachword {
	
	public static String Reverseword(String str) {
		String ans="";
		int start=0;
		
		int i=0;
		for (; i<str.length();i++) {
			// checking for space or word ended
			
			if (str.charAt(i)==' ') {
				
				int endword=i-1;
				// Reversing the words
				String Reverse="";
				for (int j=start; j<=endword;j++) {
					Reverse=str.charAt(j)+Reverse;
				}
				// adding in final string
				ans+=Reverse+" ";
				start= i+1;
			}
			
			
		}
		int endword=i-1;
		
		String Reverse="";
		for (int j=start; j<=endword;j++) {
			Reverse= str.charAt(j)+Reverse;
		}
		
		ans+=Reverse;
		return ans;
		
		
	}

	public static void main(String[] args) {
		String str= "Welcome to Coding Ninjas";
		System.out.println(Reverseword(str));
		

	}

}
