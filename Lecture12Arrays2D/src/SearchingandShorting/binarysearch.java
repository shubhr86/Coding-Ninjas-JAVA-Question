package SearchingandShorting;

import java.util.Scanner;

public class binarysearch {
	 public static int binarySearch(int[] arr, int x) {
	        int start = 0;
	        int end = arr.length - 1;
	        int mid = start;
	        while(start <= end)
	        {
	            mid = start + (end - start) / 2;
	            if (arr[mid] > x){
	                end = mid - 1;
	            }
	            else if
	                (arr[mid] < x)
	            {
	                start = mid + 1;
	            }
	            else
	            {
	                return mid;

	            }
	        }
	        return -1;
	    }
	

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		int numbers []= new int [size];
		
		//input loop
		for (int i=0;i<size;i++) {
			numbers[i]=s.nextInt();
		}
		//output loop
		//for (int i=0;i<numbers.length;i++) {
			System.out.println(binarySearch(numbers, size));
		}
		

		

	}


