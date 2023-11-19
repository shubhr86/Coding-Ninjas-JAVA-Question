package Basic_String_Questions;

public class countOfConsonentVowels {

	public static void main(String[] args) {
		
		// assuming in this question we need to calculate seprate count for each category of chars. if not then we can sum all of the count varibale and get the total count. i calculated all seperatly
		

		String s="AGKHB@+/";
		s=s.toLowerCase();
		 int vowelCount = 0;
	     int consonantCount = 0;
	     int specialCharCount = 0;
	        
	        
		for (int i=0; i<s.length(); i++) {
			
			// for special char
			if (s.charAt(i) >='a' && s.charAt(i) <='z') {
				
				// for vowels 

				if (s.charAt(i) =='a' || s.charAt(i)=='e' || s.charAt(i)== 'i' || s.charAt(i) =='o'|| s.charAt(i)=='u') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
				
			}else {
				specialCharCount++;
			}

	}
		System.out.println("vowelCount "+vowelCount);
		System.out.println("consonantCount "+consonantCount);
		System.out.println("specialCharCount "+specialCharCount);


	}
}
