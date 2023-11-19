package tryingmyself;

public class minandmaxDifference {

	public static void main(String[] args) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]= {58,24,13,15,63,9,8,81,1,78};
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}else if (arr[i]<min) {
				min=arr[i];
			}
		}
		int maximumdiff= max-min;
		System.out.println("Max Diff "+maximumdiff);
		
		for (int i = 0; i < arr.length - 1; i++) 
            for (int j = i + 1; j < arr.length; j++) 
                if (Math.abs((arr[i] - arr[j])) < min) 
                    min = Math.abs((arr[i] - arr[j]));
					
					System.out.println("Minimum Difference "+min);

	}
            }
