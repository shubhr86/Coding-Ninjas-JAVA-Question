package selftest;

public class returnAverage {
	
	 public static String average(int A[], int N)
	    {
		
	        double sum =0;
	       
	        
	        for (int i=0; i< N; i++){
	            sum+=A[i];
	        }
	
	        return String.format("%.2f", sum/N);
	      
	       
	        
	    }
		 
	    

	public static void main(String[] args) {
		int n =5;
		int arr[]= {1,2,3,4,5};
		System.out.println(average(arr, n));

	}

}
