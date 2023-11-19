package Recursionssignment;

public class staircase {
	
	public static int staircase(int n) {
		// base case 
		if (n==0) {
			return 1;
		} else if (n==1) {
			return 1;
		}else if (n==2) {
			return 2;
		
		}
		int x= staircase(n-1);
		int y=staircase(n-2);
		int z= staircase(n-3);
		int sum= x+y+z;
		return sum;
		
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(staircase(n));

	}

}
