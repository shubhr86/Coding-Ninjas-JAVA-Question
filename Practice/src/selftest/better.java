package selftest;

public class better {
	
	public static int [] better(int a[], int b[]) {
		int ans []= new int [2];
		int ca=0, cb=0;
		for (int i=0; i<a.length && i< b.length; i++) {
			if (a[i] < b[i]) {
				ans[0]=	cb++;
				
				
			} if (a[i] > b[i]) {
				ans [1]=ca++;
				

			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		int a[]= {4,2,7};
		int b[]= {5,6,3};
	int ans[] =	better(a, b);
	for (int i=0; i<ans.length; i++) {
		System.out.print(ans[i]+" ");
	}

	}

}
