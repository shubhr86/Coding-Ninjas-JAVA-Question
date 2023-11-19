package Basic;

public class coinTower {
	
	public static String tower(int n, int x, int y) {
		int storage[]= new int[n+1];
		for (int i=0; i<storage.length;i++) {
			storage[i]= -1;
		}
		int ans = findwinner(n,x,y,storage);
		if (ans ==1) {
			return "Beerus";
		}else {
			return "Whis";
		}
		
	}

	private static int findwinner(int n, int x, int y, int[] storage) {
		if (n==0) {
			storage[n]=0; // Whis win
			return storage[n];
		}
		if (n==1) {
			storage[n]=1; // B win
			return storage[n];
		}
		if (storage[n]!= -1) {
			return storage[n];
		}
		int op1= findwinner(n-1, x, y, storage);
		if (op1==0) {
			storage[n]=1;
			
			return storage[n];
		}
		if (n>=x) {
			int op2= findwinner(n-x, x, y, storage);
			
			if (op2==0) {
				
				storage[n]=1;
				return storage[n];
			}
		}
		if (n>=y) {
			int op3= findwinner(n-y, x, y, storage);
			
			if (op3==0) {
				
				storage[n]=1;
				return storage[n];
			}
		}
		storage[n]=0;
		return storage[n];
		
		
	}

	public static void main(String[] args) {
		int n=10;
		int x=2, y=3;
		System.out.println(tower(n, x, y));

	}

}
