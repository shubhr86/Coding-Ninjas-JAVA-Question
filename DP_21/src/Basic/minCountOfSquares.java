package Basic;

public class minCountOfSquares {
	
	public static int minCount(int n) {
		//Your code goes here
		int storage[]= new int [n+1];
		for (int i=0; i<storage.length; i++){
			storage[i]= -1;
		}
		return count(n, storage);
	}
	
	public static int count(int n, int storage[]) {
		if (n==0) {
			// we reach if n =10 then n-5^2;
			return 0;
		}
		int minAns = Integer.MAX_VALUE;
	
		for (int i=1; i*i <=n; i++) {
			
			int currAns;
			if (storage[((n-(i*i)))]== -1) {
				currAns= count(n-(i*i), storage);
				storage[n-(i*i)]= currAns;
			}else {
				currAns= storage[n-(i*i)];
			}
			
			if(minAns > currAns) {
				minAns=currAns;
			}
		}
		int myans=1+minAns;
		return myans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int ans = minCount(n);
		System.out.println(ans);
	}

}
