package Naturalnumber;

public class isStringPalindrome {
	public static boolean isStringPalindrome(String input, int StartIndex, int EndIndex) {
		
		if (StartIndex>= EndIndex) {
			return true;
		}
		boolean check = true;
		//checking StartIndex and endIndex char same or not
		
		if (input.charAt(StartIndex)== input.charAt(EndIndex)) {
			
			//checking rest char by increase startindex and decrese endindex by 1
			
			check = isStringPalindrome(input, StartIndex+1, EndIndex-1);
				
			} else {
				check= false;
			}
		return check;
	}
	
	
	public static boolean isStringPalindrome(String input) {
		return isStringPalindrome(input, 0, input.length()-1); // decrease end index by 1 
	}

		

	public static void main(String[] args) {
		String input = "shubham";
		System.out.println(isStringPalindrome(input));

	}

}
