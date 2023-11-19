package Naturalnumber;

public class lastIndex {
	
	public static int lastindex(int input [], int startIndex, int x) {
		// base case
	if (startIndex == input.length) {
		return -1;
	}
	
	int smallans = lastindex(input, startIndex + 1,x);
	if (smallans!= -1) {
		return smallans;
	} if (input[startIndex]==x) {
		return startIndex;
	}else {
		return -1;
	}
	}
	
	
	// function overloading
	public static int lastindex(int input [], int x) {
		return lastindex(input, 0,x);

	}

	public static void main(String[] args) {
		int arr[]= {4,2,8,4,12};
		int x= 4;
		System.out.println(lastindex(arr, x));

	}

}
