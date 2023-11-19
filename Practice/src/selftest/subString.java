package selftest;

public class subString {
	
	public static String sub (String s, int l, int r) {
		String ans ="";
		String newString=s.substring(l, r+1);
		for (int i=0; i<newString.length(); i++) {
			ans+=newString.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
	
		String s="cdbkdubgg";
		int l=0;
		int r=5;
		System.out.println(sub(s, l, r));
	}

}
