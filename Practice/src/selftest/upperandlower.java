package selftest;

public class upperandlower {
	
	
	public static String upper(String s) {
		StringBuilder ans = new StringBuilder();
		for (int i=0; i<s.length(); i++) {
			char ch= s.charAt(i);
			
			// upper chars
			if (ch >='A' && ch <='Z') {
				ch=(char)(90-(ch-65+1)+1);
			}
			
			// lower chars
			if (ch >='a' && ch <='z') {
				ch=(char)(122-(ch-97+1)+1);
			}
			ans.append(ch);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String s ="A";
		System.out.println(upper(s));

	}

}
