package SearchingandShorting;

public class Insertionsort {
	
	public static void Instertionshort(int arr[]) {
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= {5,10,2,5,8,15,3,1,0,7,6};
		
		//Insertion Sort
		
		for (int i=0; i<arr.length;i++) {
			int currentnumber = arr[i]; // current num 1st index hoga Arrays ka
			 int j=i-1;
			while(j>=0 && currentnumber<arr[j]) {
				arr[j+1]= arr[j];
				j--;
			}
			// Placement
			arr[j+1]=currentnumber;
			
		}
		
		Instertionshort(arr);

	}

}
