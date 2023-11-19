package ArrayPractce;

public class printFloatSum {

	public static void main(String[] args) {
		float [] makrs= {45.6f,88.9f,78.67f,89};
		float sum=0;
		for (float element:makrs) {  // for Adding marks
			sum=  element+sum;
		}
		System.out.println(sum);

	}

}
