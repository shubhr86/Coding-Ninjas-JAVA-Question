package Naturalnumber;

public class sumofArray {
	
	public static int sum(int input[]) {
		int sum=0;
		int ans=0;
		if (input.length <= 0) {
			return 0;
		}
		int smallpart[]= new int [input.length- 1 ];

		for (int i=1; i<input.length;i++) {
			smallpart[i-1]= input[i];
	}
		int output = sum(smallpart);
		for (int i=0; i < smallpart.length;i++) {
			sum= sum+smallpart[i];
			
			 ans = sum+ input[0];
		}
		return ans;
	}
	public static void main(String[] args) {
		int input []= {2,5,8,9,10};
		System.out.println(sum(input));

	}

}
