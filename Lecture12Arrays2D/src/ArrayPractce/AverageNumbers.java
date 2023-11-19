package ArrayPractce;

public class AverageNumbers {

	public static void main(String[] args) {
		float [] makrs= {45.6f,88.9f,78.67f,89};
		float sum=0;
		float k=makrs.length;
		float Average=0;
		for (float element:makrs) { 
			sum=  element+sum;
			 Average= sum/k;
		}
		System.out.println(Average);

	}

}