package Naturalnumber;

public class ArraySortedBetter {
	
	public static boolean checksorted(int input [], int startIndex) {
		
		if (startIndex >= input.length-1) {
			return true;
		}
		if (input[startIndex] > input [startIndex + 1]) {
			return false;
		}
		boolean checkans= checksorted(input, startIndex +1);
		return checkans;
	}
	
	public static boolean checksorted(int input []) {
		
		return checksorted(input, 0);
		
	}

	public static void main(String[] args) {
		int input []= {2,5,2,10,12};
		System.out.println(checksorted(input));

	}

}
