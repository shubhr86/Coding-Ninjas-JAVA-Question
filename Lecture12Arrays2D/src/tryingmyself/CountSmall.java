package tryingmyself;

public class CountSmall {
	 public static int[] countS(int n, int m, int []A, int []B) {
		 int [] output= new int [A.length];
		 for (int i=0;i<A.length;i++) {
			 int count=0;
			 for (int j=0; j<B.length;j++) {
				 if (B[j]<=A[i]) {
					 count++;
				 }
			 }
			 output[i]=count;
		 }
		return output;
	}

	public static void main(String[] args) {
		int arr1[]= {2,3,0,8};
		int arr2[]= {5,1};
		for (int i=0;i<arr1.length;i++) {
				
				int k[]= countS(i, i, arr1, arr2);
				System.out.print(k[i]+","+" ");
			}
		}

	}


