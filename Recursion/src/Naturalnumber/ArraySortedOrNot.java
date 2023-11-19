package Naturalnumber;

public class ArraySortedOrNot {
	
	public static boolean checksorted(int input []) {
		if (input.length<= 1) {
			return true;
		}
		// make a new array for rest element except 0th index
		int smallans[] = new int [input.length-1];
		// copy all the elements in smallans array
		for (int i=1; i<input.length;i++) {
			smallans[i-1] = input[i]; // copied the elements into smallans
		}
		boolean smallinput = checksorted(smallans);
		if (!smallinput) {
			return false;
		} if (input[0]<= input[1] ) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int input []= {2,5,8,9,10};
		System.out.println(checksorted(input));

	}

}
