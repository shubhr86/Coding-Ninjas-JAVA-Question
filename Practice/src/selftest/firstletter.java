package selftest;

public class firstletter {
	
	public static String first(String s) {
		StringBuilder ans= new StringBuilder();
		String ch="";
		
			
			if (s.charAt(0) >='A' && s.charAt(0) <='Z') {
				ch=s.toUpperCase();
			}
			if (s.charAt(0) >='a' && s.charAt(0) <='z') {
				ch=s.toLowerCase();
			}
			ans.append(ch);
		
		return ans.toString();
	}

	public static void main(String[] args) {
		String s="abcd";
		System.out.println(first(s));

	}

}
