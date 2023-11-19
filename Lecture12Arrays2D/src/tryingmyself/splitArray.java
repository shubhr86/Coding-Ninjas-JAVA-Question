package tryingmyself;

public class splitArray {

	public static void main(String[] args) {
		int arr[]= {58,24,13,15,63,9,8,81,1,78};
		int mid=arr.length/2;
		
		int arr1[]= new int [5];
		int arr2[]= new int [5];

		System.out.println("Part 1 Of Array");
		for (int i=0;i<mid;i++) {
			arr1[i]=arr[i];
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Part 2 Of Array");
	
		int j=0;
		for (int i=mid;i<arr.length;i++) {
			arr2[j]=arr[i];
			System.out.print(arr2[j]+" ");
			j++;
		}
		
	}

}
