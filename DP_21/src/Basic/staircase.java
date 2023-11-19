package Basic;

public class staircase {
	
	public static long staircase(int n) {
		int storage[]=  new int [n+1];
		return staircase(n,storage);
		
	}
	public static int staircase(int n, int storage[]) {	
		if (n==0 || n==1) {
			storage[n]=1;
			return storage[n];
		}
			
		
		if (storage[n] !=0) {
			return storage[n];
		}
		int op1=staircase(n-1,storage) ;
		int op2= 1;  
		int op3= 0;
		if (n-2>0) {
			op2= staircase(n-2, storage);
		}
		if (n-3 >=0) {
			op3= staircase(n-3, storage);
		}
		storage[n]= (op1+op2+op3);
		return storage[n];
		
		}
	

	public static void main(String[] args) {
		System.out.println(staircase(10));

	}

}
