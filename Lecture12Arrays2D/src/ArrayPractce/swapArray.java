package ArrayPractce;

public class swapArray {

	public static void main(String[] args) {
		int [] arr1= {5,6,9,7,15,48};
		int temp;
		int l=arr1.length;
		int k= l/2;
		int i=0;
		// input Loop
		for ( i=0;i<k;i++) {
			
			//swapping
			temp=arr1[i];
			arr1[i]=arr1[l-1-i];
			arr1[l-1-i]=temp;
			
		}
		//Output Loop
		for ( i=0;i<l;i++) {
			System.out.print(arr1[i]+" ");
		}
		

	}

}
