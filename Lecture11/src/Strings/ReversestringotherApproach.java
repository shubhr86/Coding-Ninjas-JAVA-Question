package Strings;

public class ReversestringotherApproach {

	
public static String outputstring(String str) {
		
		// for collecting elements of Strings need to use a Empty String
		
		String reversestring ="";
		
		// using for loop for every element
		
		for (int i=0;i<= str.length()-1;i++) {
			reversestring= str.charAt(i)+reversestring; //other approach
		
		}
		return reversestring;
	}

	public static void main(String[] args) {
		String str = "shubham";
		String k= outputstring(str);
		System.out.print(k);
				

	}

}

