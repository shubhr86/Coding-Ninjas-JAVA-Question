package selftest;

public class hello {
	
	public static boolean hello(String greetings) {
		String s="hallo",s2= "ciao", s3="salut", s4="hola", s5="ahoja", s6="czesc";
		if (greetings.contains(s) || greetings.contains(s2) 
				|| greetings.contains(s3) || greetings.contains(s4)
				|| greetings.contains(s3) || greetings.contains(s4)) {
			return true;
		}else {
			return false;
		} 
	}
	

	public static void main(String[] args) {
		String str="hombre! Hola!, good to see you";
		System.out.println(hello(str));

	}

}
