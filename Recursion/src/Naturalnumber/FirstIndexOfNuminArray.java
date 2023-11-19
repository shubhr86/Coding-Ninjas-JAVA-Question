package Naturalnumber;

public class FirstIndexOfNuminArray {
	
public static int firstindex(int input [], int startIndex, int x) {
		// base case
	if (startIndex == input.length) {
		return -1;
		
		// checking the number x presented on Arry's first index or not?
	}
	if (input[startIndex] == x) {
		return startIndex;
	} 
	// if not present increase the StartIndex to reduce the size of the array
	return firstindex(input, startIndex + 1,x);
	
		
	}
	
	
	// function overloading
	public static int firstindex(int input [], int x) {
		return firstindex(input, 0,x);

	}

	public static void main(String[] args) {
		int arr[]= {5,4,8,4,12};
		int x= 4;
		System.out.println(firstindex(arr, x));

	}

}
