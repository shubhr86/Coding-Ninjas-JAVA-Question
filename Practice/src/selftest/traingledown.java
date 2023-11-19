package selftest;


public class traingledown {
	
	public static String traingle(String S) {
		String ans="";
		String dot="";
		
		for (int i=0; i<S.length(); i++) {
			if (i >0) {
				dot+=".";
			}
			ans+=dot+S.substring(i,S.length());
			
		}
		return ans;
	}

	public static void main(String[] args) {
		String s="Geeks";
		for (int i=0; i<1; i++) {
			System.out.println(traingle(s));
		}
		

	}

}
