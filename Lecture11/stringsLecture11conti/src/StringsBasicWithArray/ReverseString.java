package StringsBasicWithArray;

public class ReverseString {
	
	public static void reverse(String s , int Startindex) {
		
		if (Startindex==0) {
			System.out.print(s.charAt(Startindex));
			return ;
		}
		
		System.out.print(s.charAt(Startindex));
	
				reverse(s, Startindex-1);
		
	}
	


	public static void main(String[] args) {
		String s ="abcde";
		reverse(s, s.length()-1);
	
	}

}
