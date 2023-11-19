package StringsBasicWithArray;

public class string {

	// public static void main(String[] args) {
//		String str= "Shubham";
//		System.out.println(str.charAt(0));
//		String a ="abcd";
//		String b="abcdA";
//		System.out.println(a.compareTo(b));
	
	public static void main (String[] args) {
		String a="coding",b="ninjas";
		if(a.contains("ing"))
		{
		    a+=b;
		}
		else
		{
		    b+="ing";
		}
		System.out.print(b+a);
		}

	}


