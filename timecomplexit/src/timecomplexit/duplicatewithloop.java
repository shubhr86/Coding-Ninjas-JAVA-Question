package timecomplexit;

public class duplicatewithloop {
	public static void findDuplicate(int[] arr) {
		//Your code goes here
        
      int ans = 0;
        int count=0;
        for(int i = 0; i<arr.length; i++){
           for(int j = i+1; j<arr.length;j++){
               if (arr[i]==arr[j]){
                   count++;
                   if (count>=2){
                       ans = arr[j];
                       System.out.println(ans);
                       
                    }
                 
                   }
              
           }
        }
		
        
       
	}

	public static void main(String[] args) {
			int[] arr= {0 ,9 ,7, 5, 4 ,9, 1 ,3 ,6};
		
			findDuplicate(arr);

	}

}
