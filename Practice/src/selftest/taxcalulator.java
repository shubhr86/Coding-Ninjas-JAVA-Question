package selftest;

public class taxcalulator {
	
	public static void taxcalculate( int grosssalary, int savings) {
		int taxableincome=0;
		// slab 1
		taxableincome= grosssalary- savings;
		int slab2= taxableincome-100000;
		
		
		if (taxableincome < 100000) {
			System.out.println("No tax");
		 
			}  // slab 2
			
			if (taxableincome < 200000 && taxableincome > 100000) {
				int tax= (taxableincome-100000* 10)/100;
				System.out.println(tax);
			}
			 if (taxableincome<500000 && taxableincome >20000) {
				 int tax = 10000+(taxableincome-20000 *20)/100;
				 System.out.println(tax);
			 }
		
			if (taxableincome >= 500000) {
				int tax= 10000+60000+(taxableincome-500000*30)/100;
				System.out.println(tax);
			}
		
		
		
	}

	public static void main(String[] args) {
		int grosssalary=800000;
		int saving=300000;
		taxcalculate(grosssalary, saving);

	}

}
