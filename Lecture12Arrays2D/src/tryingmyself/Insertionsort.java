package tryingmyself;

public class Insertionsort {
	
	public static void insertionSort(int arr[]) {
		for (int i=1; i<arr.length; i++) {
			int j=i-1;
			int temp=arr[i];
			
			//swapping and stepping task
			
			while (j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	
	}

	public static void main(String[] args) {
		int arr[]= {8,9,2,45,12,3,7,9,0};
		insertionSort(arr);
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
