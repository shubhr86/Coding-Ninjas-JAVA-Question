package Basic;

public class countSteps_MeminozationMethod {
	
	public static int countSteps(int n) {
		int storage[]= new int [n +1];
		return countSteps(n, storage);
	}

	private static int countSteps(int n, int[] storage) {
		if (n ==1) {
			storage[n]=0;
			return storage[n];
		}
		if (storage[n]!= 0) {
			return storage[n];
		}
		int op1= countSteps(n-1, storage);
		int minSteps=op1;
		
		if (n%3==0) {
			int op2= countSteps(n / 3, storage);
			if (op2 < minSteps) {
				minSteps=op2;
			}
		}
		if (n%2==0) {
			int op3= countSteps(n /2, storage );
			if (op3< minSteps) {
				minSteps=op3;
			}
		}
		storage[n]= 1+minSteps;
		return storage[n];
	}
	
	
	public static int countStepsDP(int n) {
		int storage[]= new int [n+1];
		// in starting arrat has only 0
		storage[1]=0;
		for (int i=2; i<=n; i++) {
			int min= storage[i-1];
			if (i % 3==0) {
				if (min > storage[i/3]) {
					min= storage[i/3];
				}
			}
			if (i % 2==0) {
				if (min > storage[i/2]) {
					min= storage[i/2];
				}
			}
			storage[i]= 1+min;
		}
		return storage[n];
		
	}

	public static void main(String[] args) {
		System.out.println(countSteps(5));
		System.out.println(countStepsDP(5000));
	}

}
