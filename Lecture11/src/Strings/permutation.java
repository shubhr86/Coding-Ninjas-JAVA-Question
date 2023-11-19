package Strings;

public class permutation {
	
	public static boolean isPermutation(String str1, String str2) {

	// taking same array memory
	 int[] A = new int[265];
     int[] B = new int[265];
     
     for(int i = 0; i<str1.length(); i++){
         A[str1.charAt(i)]++;
     }
     
     for(int i = 0; i<str2.length(); i++){
         B[str2.charAt(i)]++;
     }
     
     for(int i = 0; i<265; i++){
         if(A[i] != B[i]){
             return false;
         }
     }
     return true;
	}



	public static void main(String[] args) {
		String Str1= "aba";
		String Str2= "baa";
		System.out.println(isPermutation(Str1, Str2));

	}

}
