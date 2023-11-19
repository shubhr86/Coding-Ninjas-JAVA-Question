package Recursionssignment;


public class towerofhanoi {
	
	public static void towerofhanoi(int n , char source, char helper, char destination ) {
		// base case 
		if (n==0 ) {
			System.out.println("");
			return;
		} else if (n==1) {
			
			System.out.println("Move 1st Disk from "+source+" to "+destination);
			return;
		} else {
			// move n-1 disk
			towerofhanoi(n-1, source, destination, helper);
			
			// move the nth or largest disk
			System.out.println("move "+n+"th disk from "+source+" to "+destination);
		}
		// move the n-1 disk using source as helper
		
		towerofhanoi(n-1, helper, source, destination);
		
	}

	public static void main(String[] args) {
		int n=2;
		char source='s';
		char helper='h';
		char destination='d';
		towerofhanoi(n, source, helper, destination);

	}

}
