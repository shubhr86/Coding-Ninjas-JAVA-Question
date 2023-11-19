package timecomplexit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pairsum {
	public static void printpairSum(int[] arr, int num){
		
		   
		for(int i=0;i<arr.length;i++)
		{ 
		    for(int j=i+1;j<arr.length;j++)
		    {
		     
		      
		        if(arr[i]+arr[j]==num)
		        {
		            if(arr[i]<arr[j])
		            System.out.println(arr[i]+" "+arr[j]);
		             
		            else
		               System.out.println(arr[j]+" "+arr[i]); 
		        }
		       
		    }
		}
	}
	
	public static int pairsum(int []arr, int num) {
		
		int arr1[]= {2 ,8 ,10, 5, -2 ,5};
		num=10;
		printpairSum(arr1, num);
		return num;
		
	}

	public static void main(String[] args) {
		pairsum(null, 10);

	}

}
