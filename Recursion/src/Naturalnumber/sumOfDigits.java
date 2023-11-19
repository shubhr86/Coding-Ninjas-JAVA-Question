package Naturalnumber;

public class sumOfDigits {
	
	
	
	public static int sumOfDigits(int input){
		if (input ==0) {
			return 0;
		}
		int smallans= sumOfDigits(input/10);
		
		
		return smallans+input%10;
	}

		

	public static void main(String[] args) {
		int input =5;
		System.out.println(sumOfDigits(input));

	}

}
