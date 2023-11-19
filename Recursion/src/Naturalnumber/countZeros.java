package Naturalnumber;

public class countZeros {
	public static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0 
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;			
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);

		
	}


	public static void main(String[] args) {
		int input=510800;
		System.out.println(countZerosRec(input));

	}

}
