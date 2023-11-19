package selftest;

public class printwithLoop {
	
	 public static void printNos(int N) {
		 	if(N>0){
	           printNos(N-1);
	           System.out.print(N+ " ");
		 }
	 }

	public static void main(String[] args) {
		printNos(5);

	}

}
