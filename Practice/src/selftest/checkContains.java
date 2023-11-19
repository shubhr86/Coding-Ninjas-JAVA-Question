package selftest;

public class checkContains {
	
	
	
	public static String removeCharacters(String S) {
		String ans ="";
		for (int i=0; i<S.length(); i++) {
			if (S.charAt(i) >= 48 && S.charAt(i) <= 57) {
				ans+=S.charAt(i);
			}
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s ="av4er58a20g8";
		System.out.println(removeCharacters(s));
	}

}
