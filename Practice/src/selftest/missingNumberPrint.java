package selftest;

public class missingNumberPrint {
	
	public static int MissingNumber(int arr[], int n) {
		 int ans =0;
		for (int i=1;i<=n; i++) {
			ans+=i;
		}
		for (int i=0; i<n-1; i++) {
			ans -= arr[i];
		}
		return ans;
	 }

	public static void main(String[] args) {
		int arr[]= {6,1,2,8,3,4,7,10,5};
		int n =10;
		System.out.println(MissingNumber(arr, n));

	}

}
