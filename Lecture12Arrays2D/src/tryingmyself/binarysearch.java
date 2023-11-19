package tryingmyself;

import java.util.Scanner;

public class binarysearch {
	
	public static int binarySearch(int arr[], int X) {
		int start=0;
		int end = arr.length -1;
		while (start<=end) {
			int mid=(start+end)/2;
			if (X==arr[mid]) {
				return mid;
			}else if (X>arr[mid]) {
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int numbers[]=new int [size];
		
		//input Loop
		for (int i=0;i<size;i++) {
			numbers[i]=s.nextInt();
			
			
		}
		int k= binarySearch(numbers, size);
		System.out.println(k);
	

	}

}
