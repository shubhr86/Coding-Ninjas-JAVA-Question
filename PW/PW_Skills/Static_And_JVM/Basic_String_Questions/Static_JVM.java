package Basic_String_Questions;


class Demo1{
	static int a;
	static int b;
	
	int m;
	int n;
	
	static {
		a=10;
		b=20;
		System.out.println("Controll in static block");
	}
	
	{
		m=100;
		n=200;
		System.out.println("controll in non static block");
	}
	static void dispaly1() {
		
		System.out.println("value of static var "+a);
		System.out.println("value of static var "+b);

	}	
	 void dispaly2() {
		
		System.out.println("value of instance var "+m);
		System.out.println("value of instance var "+n);

	}
	
	
}



public class Static_JVM {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1 d= new Demo1();
		Demo1.dispaly1();
		d.dispaly2();

	}

}
