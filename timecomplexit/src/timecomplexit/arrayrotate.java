package timecomplexit;

public class arrayrotate {
    public static int arrayRotateCheck(int[] arr){
    	int ans =0;
    	for (int i=0;i<arr.length-1;i++) {
    		if (arr[i] > arr[i+1]) {
    			return i+1;
    		}
    		
    	}
    	return ans;
    }

    	

	public static void main(String[] args) {
		int arr[]={5 ,6 ,1, 2 ,3, 4};
		System.out.println(arrayRotateCheck(arr));

	}

}
