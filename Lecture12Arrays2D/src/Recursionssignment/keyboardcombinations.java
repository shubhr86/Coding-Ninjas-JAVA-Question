package Recursionssignment;

public class keyboardcombinations {
	
	public static String [] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		
	private static void keyscomb(String str, int index, String combination) {
		if (index== str.length()) {
			System.out.println(combination);
			return;
		}
		char currentchar= str.charAt(index);
		String mapping= keypad[currentchar-'0'];
		
		for (int i=0; i<mapping.length();i++) {
			keyscomb(str, index + 1, combination+ mapping.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		String str="23";
		keyscomb(str, 0, "");

	}

}
