package tryingmyself;

public class splitHighestNumber {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		int arr[]= {4,8,6,3,2};
		int arr1[]=new int [arr.length+1];
		int j=0;
		
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
				j=i;
			}
		}
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<max && arr[i]>secondmax) {
				secondmax=arr[i];
			}
		}
		
		for (int i=0;i<j;i++) {
			arr1[i]=arr[i];
		}
		arr1[j]= secondmax;
		arr1[j+1]= max-secondmax;
		for (int i=j+2;i<arr1.length;i++) {
			arr1[i]= arr[i-1];
		}
		for (int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();

	}

}
