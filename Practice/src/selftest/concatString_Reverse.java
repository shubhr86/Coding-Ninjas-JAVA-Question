package selftest;

public class concatString_Reverse {
	
	public static String reverse(String s1, String s2) {
		String ans="";
		String new_String=s1.concat(s2);
		for (int i=new_String.length()-1; i>=0; i--) {
			ans+=new_String.charAt(i);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		String s="Geeks";
		String s1="for";
		System.out.println(reverse(s, s1));

	}

}
