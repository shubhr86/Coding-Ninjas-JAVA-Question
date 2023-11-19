package selftest;

public class findArrayIndex {

	public static int[] find(int arr[], int n, int key){
		int ans[]= new int [2];
		int count=0;
		for (int i=0; i<n ; i++	) {
		if (arr[i]== key ) {
				ans[0]=i;
				count++;
				break;
				
			}
		}
				for (int j=n-1; j>=0; j--) {
					if (arr[j]== key ) {
				
					ans[1]=j;
					break;
				}
			}
		if (count ==0) {
			ans[0]=-1;
			ans [1]= -1;
			return ans;
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,5};
		int key=5;
		int n=6;
		System.out.println(find(arr, n, key));

	}

}
