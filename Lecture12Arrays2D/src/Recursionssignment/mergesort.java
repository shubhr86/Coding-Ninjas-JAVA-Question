package Recursionssignment;

public class mergesort {
	
	public static void mergesort(int [] input) {
		// base case
		if (input.length<=1) {
			return;
		}
		
		int mid= input.length/2;
		
		// part1 and part2 temp Arrays
		
		int [] part1= new int [mid];	
		int [] part2= new int[input.length-mid];
		
		// copy elements into temp Arrays
		for (int i=0;i<mid;i++) {
			part1[i]= input[i];
		}
		int k =0;
		for (int i=mid;i<input.length;i++) {
			part2[k]= input[i];
			k++;
		}
		// call merge recursively
		mergesort(part1);
		mergesort(part2);
		merge(input, part1,part2);
	}
	private static void merge (int [] input, int part1[], int part2[]) {
		
		// merging subArrays of Array
		
		int i=0,j=0,k=0;
		// run while loop until array length is to be 1
		while (i<part1.length && j<part2.length) {
			if (part1[i]< part2[j]) {
				input[k]= part1[i];
				
				k++;
				i++;
			}
			else {
				input [k]= part2[j];
				k++;
				j++;
			}
		}
		// copy remaning elemnets of part1 if any,
		while(i< part1.length) {
			input [k]= part1[i];
			k++;
			i++;
		}
		// copy remaning elemnets of part2 if any,

		while (j<part2.length) {
			input[k]= part2[j];
			k++;
			j++;
		}
	}

	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {5,9,1,6,8,5,4,12,3};
		mergesort(input);
		printArray(input);
		
	}
}
