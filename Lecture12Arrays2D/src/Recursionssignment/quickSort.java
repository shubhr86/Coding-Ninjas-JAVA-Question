package Recursionssignment;

public class quickSort {
	public static void quickSort(int arr[], int si, int ei) {
		// base case
		if (si>=ei) {
			return;
		}
		int pivotpos=parition(arr, si, ei);
		// recursive call
		quickSort(arr, si, pivotpos-1);
		quickSort(arr, pivotpos+1, ei);
		
	}
	
	public static int parition(int [] arr, int si,int ei) {
		// 1st element of array now in pivot
		
		int pivot = arr[si];
		
		// take count for counting elements before the pivot, <= pivot
		int count=0;
		for (int i=si+1; i<=ei;i++) {
			// all elements <= pivot then increase the count
			if (arr[i]< pivot) {
				count++;
			}
		}
		// swapping and place the pivot element to the right position 
		// and swap that element which is already present on new pivot element position
		
		int temp= arr[si+count];
		arr[si+count]= pivot;
		arr[si]=temp;
		
//		now cheking all the elements before the pivot element is <= left side of the pivotpos
//				and > to right side
//				swap those elements, those not belongs to their sides
		
		int i=si,j=ei;
		while (i<j) {
			if (arr[i]< pivot) {
				i++;
			}
			else if (arr[j]>= pivot) {
				j--;
			}
			else {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		return si+count;
	}
	
	public static void quickSort(int[] input) {
		int si=0;
		int ei= input.length-1;
		quickSort(input, 0, input.length-1);
		for (int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,8,1,2,7,9,45};
		quickSort(arr);
		parition(arr, 0, arr.length-1);
	
		
		
		

	}
	}
	

