package selftest;

import java.util.Arrays;

public class majorityElement {

	public static int majorityElement(int a[], int size)  {
		int times=size/2;
		int count=0;
		
		Arrays.sort(a);
		if (size==1) {
			return a[0];
		}
		
		for (int i=1; i<size; i++) {
			if (a[i]==a[i-1]) {
				count++;
			
			if (count >= times) {
					return a[i];
				}
				else {
					continue;
				}
			}
			count =0;
			
		}
		return -1;
		
}
	

	public static void main(String[] args) {
		int a[]= {3,1,3,3,2} ;
		int n=5;
		System.out.println(majorityElement(a, n));

	}

}
