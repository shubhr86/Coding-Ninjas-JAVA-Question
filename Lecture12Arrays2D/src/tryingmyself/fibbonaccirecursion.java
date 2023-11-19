package tryingmyself;

public class fibbonaccirecursion {
	
	public static int fibb(int n) {
		if (n==1) {
			return 0;
		} else if (n==2) {
			return 1;
		}
		return fibb(n-1)+ fibb(n-2);
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(fibb(n));

	}

}
