package Naturalnumber;

public class findNumberInArray {
	public static boolean checkNumber(int input[], int x) {
	
		if (input.length <= 0) {
			return false;
		}
		if (input[0]==x) {
			return true;
		}
		int smallpart[]= new int [input.length- 1 ];

		for (int i=1; i<input.length;i++) {
			smallpart[i-1]= input[i];
	}
		
		boolean output = checkNumber(smallpart, x);
		for (int i=1; i<smallpart.length;i++) {
		}
		return output;
	
	}

	public static void main(String[] args) {
		int input []= {2,5,8,9,10};
		int x =82;
		System.out.println(checkNumber(input, x));


	}

}
