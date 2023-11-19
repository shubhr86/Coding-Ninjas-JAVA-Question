package selftest;

public class maxSubarraySum {
	
	
	public static long maxSubarraySum(int arr[], int n){
		long sum= 0;
		long maxSum= Integer.MIN_VALUE;
		
		int i=0;
		 while (i<n) {
			 sum=sum+arr[i];
			 if (sum > maxSum) {
				 maxSum= sum;
			 }
			 if (sum<0) {
				sum=0;
			 }
			 i++;
		 }
		return maxSum;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {-2 ,1 ,-3, 4 ,-1, 2 ,1 ,-5 ,4};
		System.out.println(maxSubarraySum(arr, arr.length));


	}

}
