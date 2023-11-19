package tryingmyself;

public class shiftelement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int n=1; //Number of times array will Rotate
		
		// Rotate Array by n times
		for (int i=0; i<n;i++) {
			int j,last;
			
			// Store the last element
			
			last= arr[arr.length-1];
			
			for (j=arr.length-1;j>0;j--) {
				
				// shifting the array by one
				
				arr[j]=arr[j-1];
			}
			// Last element in front of the array
			arr[0]=last;
		}
		
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
