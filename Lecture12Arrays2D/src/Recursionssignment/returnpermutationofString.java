package Recursionssignment;

public class returnpermutationofString {
	
	public static String [] permuationOfString (String input) {
		// base case 
		
		if (input.length()==0) {
			String output[]= {""};
			return output;
		}
		String [] smalloutput= permuationOfString(input.substring(1));
		String [] output = new String [input.length() * smalloutput.length];
		int k=0;
		for ( int i=0; i<smalloutput.length;i++) {
			String currentstring = smalloutput[i];
			for (int j=0; j<=currentstring.length();j++) {
				output[k]= currentstring.substring(0,j) + input.charAt(0) + currentstring.substring(j);
				k++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String str= "abc";
		
		String output[]= permuationOfString(str);
		for (int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
		
	}
	

}
