package selftest;

public class fasinating {
	
	public static boolean fascinating(long n) {
		
	
			long product1= n *2;
			long product2= n *3;
			String s = ""+n+product1+product2;
			if (s.toCharArray().length !=9) {
				return false;
			}
			for (int i=1; i<=9; i++) {
				if (!s.contains(i+"")) {
					return false;
				}
			}
			return true;
		}
		
		
	

	public static void main(String[] args) {
		int n =192;
		System.out.println(fascinating(n));

	}

}
