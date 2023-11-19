package Strings;

public class higestcountchar {
	public static char highestOccuringChar(String str) {
		
		// Allocate memory | Array
		 int [] output= new int [300];
		 
		 for (int i=0; i<str.length();i++) {
			 output[str.charAt(i)]++;
		 }
		 
		 int count =1;
		 
		 char ans = str.charAt(0);
		 
		 for(int i=0; i<str.length(); i++) {
			 
			 if (output[str.charAt(i)]> count) {
				 
				 ans= str.charAt(i);
				 
				 count= output[str.charAt(i)];
			 }
			 
		 }
		
		return ans;
	}

	public static void main(String[] args) {
		String str = "abcdeapapqarr";
		System.out.println(highestOccuringChar(str));

	}

}
