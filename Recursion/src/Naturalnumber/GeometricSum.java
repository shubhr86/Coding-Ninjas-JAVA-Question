package Naturalnumber;

public class GeometricSum {
	public static double findGeometricSum(int k){
		
		if (k==0) {
			return 1;
		}
		double smallans= findGeometricSum(k-1);
		return  smallans + Math.pow(0.5, k);
		
		
	}

	public static void main(String[] args) {
		int k= 3;
		System.out.println(findGeometricSum(k));

	}

}
