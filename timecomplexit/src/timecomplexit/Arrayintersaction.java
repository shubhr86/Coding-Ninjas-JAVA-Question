package timecomplexit;

public class Arrayintersaction {
	
	public static void mergesort(int []arr, int start, int mid, int end) {
		int n1= mid-start+1;
		int n2= end- mid;
		
		//Creating temp Arrays
		int [] Left= new int [n1];
		int [] Right= new int [n2];
		
		// copy elements into new temp arrays
		 for (int i=0; i<n1;i++) {
			 Left[i]= arr[start+i];
		 }
		 for (int j=0; j<n2;j++) {
			 Right[j]= arr[mid+1+j];
		 }
		 // merge the arrays
		 int i=0, j=0,k=0;
		 k=start;
		 
		 while (i<n1 && j<n2) {
			 if (Left[i]<=Right[j]) {
				 arr[k]=Left[i];
				 i++;
			 }else {
				 arr[k]=Right[j];
				 j++;
			 }
			 k++;
		 }
		 
		 // copy remaning elemnts
		 
		 while (i<n1) {
			 arr[k]=Left[i];
			 i++;
			 k++;
		 }
		 while (j<n2) {
			 arr[k]=Right[j];
			 j++;
			 k++;
		 }
				 
	}
	// main sort function
	
	public static void sort(int arr[], int start, int end) {
		// base case
		if (start>=end){
	      return;
	        }
		if (start<end) {
			int mid= (start+end)/2;
			
			sort(arr, start, mid);
			
			sort(arr, mid+1, end);
			
			mergesort(arr, start, mid, end);
		}
	}
	
	public static void intersection(int arr1[], int arr2[]) {
		
		sort(arr1, 0, arr1.length-1);
		sort(arr2, 0, arr2.length-1);
		for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = 0;
                    break;
                }
            }
		}
	}


	public static void main(String[] args) {
		int arr1[]= {5,8,9,3,7,3,0};
		int arr2[]= {2,0,8,19,3,8,13,10,7};
		
		intersection(arr1, arr2);

	}

}
