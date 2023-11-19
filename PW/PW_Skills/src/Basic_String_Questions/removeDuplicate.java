package Basic_String_Questions;


public class removeDuplicate {

	public static void main(String[] args) {
		// the code logic based on consecutive duplicates char
		
		String s = "ssshhubbhaammh";
		char ch[]= s.toCharArray();
		String result="";
		for (int i=0; i<ch.length; i++) {
			
				if ( i==ch.length-1|| ch[i]!=ch[i+1]) {
					result+=ch[i];
				}
		}
		System.out.println(result);

	}

}
