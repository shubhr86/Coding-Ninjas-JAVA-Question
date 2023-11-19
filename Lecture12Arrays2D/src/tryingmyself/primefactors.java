package tryingmyself;

public class primefactors {
	
	public static void primefactor(int number) {

	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.print(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }
	

	public static void main(String[] args) {
		int x=15;
		primefactor(x);

	}

}
