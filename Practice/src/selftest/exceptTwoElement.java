package selftest;

import java.util.Arrays;

public class exceptTwoElement {
	
	public static long[] findElements( long a[], long n)
    {
		Arrays.sort(a);
		long arr[]= new long [(int) (n-2)];
		
		for (int i=0; i< n-2; i++) {
			 arr[i]=a[i];
		}
		return arr;
		
    }

	public static void main(String[] args) {
		long a[] = {2, 8, 7, 1, 5};
		int n =5;
		long ans[]=	(findElements(a, n));
		for (int i=0; i< ans.length; i++) {
		System.out.print(ans[i]+" ");
		}
		
		

	}

}
