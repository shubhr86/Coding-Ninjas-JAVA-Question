package tryingmyself;

public class reverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int n= arr.length/2;
		for (int i=0;i<n;i++) {
			//swap
			int temp=arr[i];
			arr[i]= arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		for (int element:arr) {
			System.out.print(element+" ");
		}

	}

}
