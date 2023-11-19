package Recursionssignment;

public class replcePI {
	public static String replace(String input){
		if (input.length()==0) {
			return input;
		}
		if (input.charAt(0)== 'p' && input.length()>=2 && input.charAt(1)== 'i') {
			
			String smllns=  replace(input.substring(2, input.length()));
			
			return "3.14"+ smllns;
		}
		
		return input.charAt(0)+ replace(input.substring(1, input.length()));
	}

	public static void main(String[] args) {
		String input= "pixpixx";
		System.out.println(replace(input));
	}

}
