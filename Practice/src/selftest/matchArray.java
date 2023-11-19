package selftest;

public class matchArray {
	

	public static boolean IsPerfect(int a[], int n)
    {
	

	int mid =n/2;
	int j =n-1;
	for (int i=0; i<mid; i++) {
		if (a[i]!=a[j]) {
			return false;
		}
		j--;
   }
   return true;
    }
   
	public static void main(String[] args) {

      int a[]= {15, 20 ,5 ,6, 5 ,6 ,13 ,4 ,3 ,4 ,13 ,6, 5 ,6, 5, 20, 15};
      int n =17;
      
      System.out.print(IsPerfect(a,n));
        }
  
}



