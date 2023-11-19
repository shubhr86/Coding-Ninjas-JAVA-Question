package tryingmyself;

public class NumInArrayorNot {
	
	public static int [] printarr(int arr[], int x) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==x) {
				System.out.println("Num Found");
				break;
			
			}
		}
		return arr;
	}
		
	

	public static void main(String[] args) {
		int arr []= {5,8,12,1,0,16};
		int x=2;
		printarr(arr, x);
			
		 
	

}
}
