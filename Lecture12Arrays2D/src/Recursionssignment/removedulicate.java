package Recursionssignment;

public class removedulicate {
	
	public static String removeConsecutiveDuplicates(String s) {
		//base case
		if (s.length()==1) {
			return s;
		}
		// recursive call
		String smallans= removeConsecutiveDuplicates(s.substring(1));
		
			if (smallans.charAt(0)== s.charAt(0)) {
				return smallans;
			}else {
				return s.charAt(0)+ smallans;
			}
		}
	

	public static void main(String[] args) {
		String str="aadad";
		System.out.println(removeConsecutiveDuplicates(str));
		
		

	}

}
