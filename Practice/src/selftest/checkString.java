package selftest;

public class checkString {
	
	 public static  boolean check (String s)
	    {
		 
	        int count =1;
	   
	       for (int i=0; i<s.length()-1; i++){
	    	   
	    	   if (s.charAt(i)== s.charAt(i+1)){
	                   count++;             
	               }
	       }
	       System.out.println(count);
	       if(s.length()==1){
	            return true;
	        }
	       if (count!= s.length()){
	           return false;
	       }else {
	           return true;
	       }
	    }
	

	public static void main(String[] args) {
		String s="u";
		System.out.println(check(s));

	}

}
