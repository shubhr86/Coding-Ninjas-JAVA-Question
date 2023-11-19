package SearchingandShorting;

public class Sort012 {
	public static void sort012(int[] arr){
	      
	      int low=0;//use for zero
	      int mid=0;//use for one
	      int high=arr.length-1;//use for two

	        while(mid<=high)
	        {
	          if(arr[mid]==0)
	          {
	            int temp=arr[mid];
	            arr[mid]=arr[low];
	            arr[low]=temp;
	            mid++;
	            low++; //Sqwaping

	          }
	          else if(arr[mid]==1)
	          {
	            mid++;
	          }

	          else{
	            int temp=arr[mid];
	            arr[mid]=arr[high];
	            arr[high]=temp;
	            high--;

	          }
	        }
	}
	        

	public static void main(String[] args) {
		int arr[]= {0,2,2,1,0,1,2,0};
		sort012(arr);
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
