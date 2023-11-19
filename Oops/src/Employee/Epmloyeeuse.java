package Employee;

public class Epmloyeeuse {

	public static void main(String[] args) {
		
		//Employee 1


		Employee e1= new Employee();
		e1.setName("Shubham");
		e1.id= 56;
		e1.setSalary(89720);
		
		//Employee 2
		Employee e2= new Employee();
		e2.setName("Mahesh");
		e2.id= 58;
		e2.setSalary(85020);
		
		// Print function call
		
		e1.printdata();
		e2.printdata();

	}

}
