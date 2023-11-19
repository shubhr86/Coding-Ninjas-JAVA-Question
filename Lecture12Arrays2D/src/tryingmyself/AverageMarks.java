package tryingmyself;

public class AverageMarks {
	
	public static int printaverage(int arr[]) {
		
		int total=0;
		for (int i=0;i<arr.length;i++) {
			total=total +arr[i];
			
		}
		
		return total;
		
	}

	public static void main(String[] args) {
		int arr[]= {80,85,90,35,50,65};
		double averagemarks= printaverage(arr)/arr.length;
		System.out.println("Average Marks");
		System.out.println(averagemarks);

	}

}
