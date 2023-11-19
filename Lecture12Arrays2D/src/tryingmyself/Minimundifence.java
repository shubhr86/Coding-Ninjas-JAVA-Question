package tryingmyself;

import java.util.Arrays;
import java.util.Collections;

public class Minimundifence {
	
	 public static int countS(int n, int m, int []arr1, int []arr2) {
		 int ans = -1;
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        int i = 0, j = 0;
	        while (i < n && j < m) {
	            int diff = Math.abs(arr1[i] - arr2[j]);
	            if (ans == -1) {
	                ans = diff;
	            } else {
	                ans = Math.min(ans, diff);
	            }

	            if (arr1[i] > arr2[j]) {
	                j++;
	            } else if (arr1[i] < arr2[j]) {
	                i++;
	            } else {
	                i++;
	                j++;
	            }
	        }

	        return ans;
	        
	    }
	

	public static void main(String[] args) {
		int arr1[]= {10,20,30};
		int arr2[]= {17,15};
		for (int i=0;i<arr1.length;i++) {
			int k= (int) countS(i, i, arr1, arr2);
				
				System.out.print(k+" ");
			}
		}

	}