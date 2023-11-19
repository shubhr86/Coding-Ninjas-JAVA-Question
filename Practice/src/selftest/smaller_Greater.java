package selftest;

public class smaller_Greater {
	
	public static int [] numers(int arr[], int n , int x) {
		
		int smaller= 0;
		int greater=0;
		int ans[] = new int [2];
		for (int i=0; i< n ; i++) {
			if (x >=arr[i]) {
				 smaller++;
				 arr[0]=smaller;
			}
			if (x <=arr[i]) {
				 greater++;
				 arr[1]=greater;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
				int 	N = 7, X = 0;
			int	Arr[] = {1, 2, 8, 10, 11, 12, 19};
			int ans[] =(numers(Arr, N, X));
			for (int i=0; i<ans.length; i++) {
				System.out.print(ans[i]+" ");
			}
			

	}

}
