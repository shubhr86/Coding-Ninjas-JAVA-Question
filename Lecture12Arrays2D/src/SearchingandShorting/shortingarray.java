package SearchingandShorting;

import java.util.Scanner;

public class shortingarray {
	
	public static void sortSlection (int input[]) {
		for (int i=0; i<input.length-1;i++) {
			
		
		int min=input[i];
		int minIndex=i;
		for(int j=i+1; j<input.length;j++) {
			if (input[j]<min) {
				min=input[j];
				minIndex=j;
				
			}
			
		}
		if (minIndex!=i) {
			input[minIndex]=input[i];
			input[i]=min;
			for(int k=0; i<input.length;i++) {
			System.out.println(input+" ");
		}
		System.out.println();
	
		}
		
	}
	}


	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int size=s.nextInt();
		int numbers[]= new int [size];
		
		for (int i=0; i<size;i++) {
			numbers[i]= s.nextInt();
		}
		for (int i=0; i<numbers.length;i++) {
			
		
			
			sortSlection(numbers);
		}
		
	}

}
