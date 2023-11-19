package Basic_String_Questions;

public class removeEveryDuplicateChar {

	public static void main(String[] args) {
		// Removing every Duplicate char from the string
		
		String s ="sshubbhamm";
		
		for (int i=0; i<s.length(); i++) {
			boolean flag= false;
			for (int j=i+1; j<s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					flag=true;
				}
			}
			if(flag) {
				System.out.print(s.charAt(i)+" ");

			}
		}
		
		

	}

}
