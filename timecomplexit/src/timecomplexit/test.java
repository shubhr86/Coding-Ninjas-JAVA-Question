package timecomplexit;

public class test {
	
	public static void func(int n)
	{
	    int sum=0;
	    for(int i=1;i<n;i+=3)
	        sum+=i;
	    System.out.println(sum);
	}

	public static void main(String[] args) {
		int n=7;
		func(n);

	}

}
