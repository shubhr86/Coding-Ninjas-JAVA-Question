package selftest;

import java.util.Scanner;

public class Arraymultipleinput {
	
	public static void printmultiplecontent() {
		Scanner s= new Scanner (System.in);
		int arr[]= new int [5];
		int positive=0;
		int negative=0;
		int even=0,odd=0;
		int zero=0;
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();

		      if(arr[i]>0){
		        positive++;
		      }
		      else if(arr[i]<0){
		        negative++;
		      }
		      else{
		        zero++;
		      }
		      if(arr[i]%2==0){
		        even++;
		      }
		      else{
		        odd++;
		      }
		    
		}
		System.out.println("Positive: "+positive+" Negative "+negative+" Zero "+zero+ " Even "+ even+" Odd "+odd);
	}

	public static void main(String[] args) {
		printmultiplecontent();
		

	}

}
