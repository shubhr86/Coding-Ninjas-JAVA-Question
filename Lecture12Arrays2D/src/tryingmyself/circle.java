package tryingmyself;

import java.util.Scanner;

public class circle {
	
	public static void circleArea(double radious) {
		System.out.println(Math.PI*radious*radious);
	}
	
	public static void circlecircumference(double radious) {
		System.out.println(2*Math.PI*radious);
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int radious=s.nextInt();
		System.out.println("Area of Circle");
		circleArea(radious);
		System.out.println("Circumference of Circle");
		circlecircumference(radious);

	}

}
