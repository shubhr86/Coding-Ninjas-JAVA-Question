package tryingmyself;

public class tabelusingrecursion {
	
	public static void printtable(int n, int i) {
		
		
		if (i!=1) {
			
			printtable(n, i-1);
		}
		
		 System.out.print(n+"x"+ i+" = ");

	      System.out.println(n*i);
		
		
	}

	public static void main(String[] args) {
		int n=5;
			printtable(n, 10);

	}

}
