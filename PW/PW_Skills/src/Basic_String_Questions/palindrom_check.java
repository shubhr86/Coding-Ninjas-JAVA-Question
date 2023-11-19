package Basic_String_Questions;

public class palindrom_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="2552";
		String reverse="";
		char ch[]= input.toCharArray();
		
		for (int i=ch.length-1; i>=0; i--) {
			reverse+=ch[i];
		}
		if (reverse.equals(input)) {
			System.out.println("Yes Palindrom");
		}else {
			System.out.println("Not Palindrom");

		}

	}

}
