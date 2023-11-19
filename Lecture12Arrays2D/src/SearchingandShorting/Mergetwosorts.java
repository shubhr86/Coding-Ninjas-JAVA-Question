package SearchingandShorting;

public class Mergetwosorts {
	
	public static int[] mergetwosorts(int arr1[], int arr2[]) {
		int i=0;
		int j=0;
		int k=0;
		
		// making 3rd Array
		int thirdArray[]= new int [arr1.length+ arr2.length];
		
		 // how much time loop will run. so we just need to run before i & j small the length
		
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i]< arr2[j]) {
				thirdArray[k]= arr1[i]; // i's number small then i print
				k++;
				i++;
			} else {
				thirdArray[k]= arr2[j]; // if j smaller then print j
				
				j++;
				k++;
			}
			
		}
		// when any array completed. so jo bhi array rha gaya hai usko directly element ko print krne ke liye
		
		while (i<arr1.length) {
			thirdArray[k]= arr1[i];
			k++;
			i++;
			
		}
		
		while (j<arr2.length) {
			thirdArray[k]= arr2[j];
			k++;
			j++;
		}
		return thirdArray;
	}

	public static void main(String[] args) {
		
		int arr1[]= {8,10,48,50};
		int arr2[]= {2,4,8,12,46,49,62};
		int thirdArray[]= mergetwosorts(arr1, arr2);
		for (int i=0; i<thirdArray.length;i++) {
			System.out.print(thirdArray[i]+ " ");
		}


	}

}
