package Basic;

public class divide {
	
	public static int countMinStepsToOne(int n) {
		if (n==1) {
			return 0;
		}
		int count =0;
		
		int op1= countMinStepsToOne(n -1);
		count= op1;
		if (n%3==0) {
		int op2= countMinStepsToOne(n / 3);
		if (op2 < op1) {
			count= op2;
		}
		}
		if (n%2==0) {
			int op3= countMinStepsToOne(n / 2);
			if (op3 < count) {
				count= op3;
			}
		}
		return 1+count;
	}

	public static void main(String[] args) {
		System.out.println(countMinStepsToOne(5));

	}

}
