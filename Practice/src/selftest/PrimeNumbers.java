package selftest;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 100, count;

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   // removing non prime number
		   for (int j = 2; j <= i / 2; j++) { 
		    if (i % j == 0) {
		     count++;  
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		 }
		}