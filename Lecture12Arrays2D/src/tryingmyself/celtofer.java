package tryingmyself;

import java.lang.ref.Cleaner.Cleanable;
import java.util.Scanner;

public class celtofer {
	
	public static float celtofer(float n) {
		float cel= ((n*9)/5)+32;
		return cel;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		float n= s.nextFloat();
		System.out.println(celtofer(n));

	}

}
