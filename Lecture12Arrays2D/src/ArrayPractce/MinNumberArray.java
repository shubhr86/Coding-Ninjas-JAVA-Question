package ArrayPractce;

public class MinNumberArray {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int arr[]= {5,8,2,1,15,49};
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]<=min) {
				min=arr[i];
				
			
		}
			
			
		}
		System.out.println("Minimum Number Is: "+min);
	}

}