package selftest;

public class binary {
	
	public static String getBinaryRep(int N){
        
        String str=Integer.toBinaryString(N);
        String ans = "00000000000000000000000000000";
      
        return ans+str;
        
    }


	public static void main(String[] args) {
		int n=2;
		System.out.println(getBinaryRep(n));

	}

}
