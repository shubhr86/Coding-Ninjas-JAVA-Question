package timecomplexit;

public class rotateArray {
	
	public static void rotate (int []arr, int d) {
		int temp[]= new int [d];
		for (int i=0;i<d;i++) {
			temp[i]= arr[i];
		}
		int j=0;
		for (int i=d;i<arr.length;i++) {
			arr[j]=arr[i];
			j++;
			
		}
		j=0;
		for (int i=arr.length-d;i<arr.length;i++) {
			arr[i]=temp[j];
			j++;
			
		}
		
	}
	  public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        System.out.println();
	    }
	public static void main(String[] args) {
		int arr[]= {1, 2, 3 ,4, 5, 6, 7};
		int d=2;
		 rotate(arr, d);
          printArray(arr);

		

	}

}
