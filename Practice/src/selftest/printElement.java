package selftest;

public class printElement {
	
	public static void print(int arr[], int n) {
		for (int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int arr[]= {1, 2, 13, 4, 5};
		print(arr, n);
	}

}
