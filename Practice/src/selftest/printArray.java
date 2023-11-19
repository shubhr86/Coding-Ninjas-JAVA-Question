package selftest;

import java.util.Scanner;

public class printArray {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		int arr[]= new int [3];
		// Loop for taking input
		for (int i=0;i<arr.length;i++) {
			
			arr[i]=s.nextInt();
		}
		
		System.out.println("Write the Number");
		int x=s.nextInt();
		// loop for output
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==x) {
				System.out.println("Num is Present");
				break;
			}else {
				System.out.println("Num is not Present");
				break;
			}
					
			
		}

	}

}
