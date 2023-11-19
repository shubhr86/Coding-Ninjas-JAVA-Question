package ifelse;

import java.util.Scanner;

//Take input of age of 3 people by user and determine oldest and youngest among them.

class ages{
	int a;
	int b;
	int c;
	
	
	void takeInput() {
		Scanner s = new Scanner (System.in);
		System.out.println("Please enter first person age");
		a=s.nextInt();
		System.out.println("Please enter second person age");
		b=s.nextInt();
		System.out.println("Please enter third person age");
		c=s.nextInt();
	}
	
	void calculateOldest() {
		if (a<=b && c<=b) {
			System.out.println("oldest is second person & age:: "+b);
		}else if (b<=a && c<=a) {
			System.out.println("oldest is first person & age: "+a);
		}else if (a<=c && b<=c) {
			System.out.println("oldest is third person & age: "+c);
		}
	}
	void calculateyoungest() {
		if (a<=b && a<=c) {
			System.out.println("youngest first person & age: "+a);
		}else if (b<=a && b<=c) {
			System.out.println("youngest second person & age: "+b);
		}else if (c<=a && c<=b) {
			System.out.println("youngest third person & age: "+c);
		}
	}
	
}



public class age {
	
	

	public static void main(String[] args) {
		
		ages user1= new ages();
		user1.takeInput();
		user1.calculateOldest();
		user1.calculateyoungest();
	}

}
