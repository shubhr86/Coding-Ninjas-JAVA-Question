package tryingmyself;

import java.util.Scanner;

public class ReverseArrayuserInput {
		

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int arr[]= new int[5];
		int arr1[]= new int[5];
		for (int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			
		}
		int j=0;
		for (int i=arr1.length-1;i>=0;i--) {
			arr1[i]=arr[j];
			j++;
		}
			for (int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		
	}

	}


