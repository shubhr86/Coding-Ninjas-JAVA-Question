package timecomplexit;

import java.util.Arrays;



public class trippleSum {
	
	public static int tripplesum(int [] arr, int num) {
		Arrays.sort(arr);
		int n =arr.length;
		int ans=0;
		for (int i=0;i<n;i++) {
			int pairsum= num-arr[i];
			int numpair=0;
			int start =i+1;
			int end =n-1;
			
			while (start<end) {
				// if i+j is lower than num move i here it is start and vise-versa
				if (arr[start]+arr[end]<pairsum) {
					start++;
				} else if (arr[start]+arr[end]>pairsum) {
					end--;
				}else {
					// start to end we reached at same element
					if (arr[start]==arr[end]) {
				
					int totalcount=(end-start)+1;
					numpair= numpair+(totalcount*(totalcount-1)/2);
					break;
				}
					int tempI= start+1;
					int tempj=end-1;
					while (tempI<=tempj && arr[start]==arr[tempI]) {
						tempI++;
				}
					while (tempI<=tempj && arr[end]== arr[tempj]) {
						tempj--;
				}
					int elementsfromstart=(tempI-start);
					int elementsfromend=(end-tempj);
					numpair+=(elementsfromend*elementsfromstart);
					start=tempI;
					end=tempj;
					
				}
			}
			ans+=numpair;
			
		}
		return ans;
		
	}

	public static void main(String[] args) {
		int[] arr= {2, -5 ,8 ,-6 ,0 ,5 ,10 ,11, -3};
		int num=10;
		System.out.println(tripplesum(arr, num));

	}

}
