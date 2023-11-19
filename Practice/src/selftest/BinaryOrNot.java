package selftest;

import java.util.Scanner;

public class BinaryOrNot {

	public static boolean binary(String str) {
		
		for (int i=0; i< str.length(); i++) {
			if (str.charAt(i)!='0' && str.charAt(i) !='1') {
				
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		s.nextLine();
		while (t > 0) {
			String str= s.nextLine();
			BinaryOrNot b= new BinaryOrNot();
			boolean g= b.binary(str);
			if (g== true)
				System.out.println(1);

			else 
				System.out.println(0);
		}

	}

}
