package Employee;

public class Employee {
	
	//Methods
	
	private String name;
	private int salary;
	int id;
	
	
	//constructors
	
	public int getSalary() {
		return salary;
	}
	 public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//constructors end
	
	
	public void printdata() {
		
		System.out.println(" My Name is:" + name);
		System.out.println(" My Employee ID is:" + id + " And my Salary is : " + salary);
	}
	

}
