package ArrayPractce;

import java.util.Scanner;

public class sum {
	
public static int pairSum(int arr[], int x) {
        
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    sum+=1;
                }
            }
        }
        return sum;
    }


	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		int numbers []= new int [size];
		
		//input loop
		for (int i=0;i<size;i++) {
			numbers[i]=s.nextInt();
		}
		//output loop
		for (int i=0;i<numbers.length;i++) {
			System.out.print("");
		}
		

		

	}

}
