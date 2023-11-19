package Basic_String_Questions;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="The quick brwon fox jumps over lazy Dog";
//		
//		s= s.replace(" ", "");
//		s=s.toLowerCase();
//		boolean flag= false;
//		// convert top char Array
//		
//		char ch[]= s.toCharArray();;
//		
//		// new Array
//		
//		int arr[]= new int [26];
//		
//		for (int i=0; i<ch.length; i++) {
//			 arr[ch[i]-65]++;
//		}
//		for (int i=0; i<arr.length; i++) {
//			
//			if (arr[i] ==0) {
//				
//				System.out.println("Not pangram");
//				flag=true;
//			}
//				
//		}
//		if (flag== false) {
//			System.out.println("Pangram");
//
//	}
		
		
		  boolean flag=false;
	        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
	        str=str.replace(" ", "");
	        char []ch=str.toCharArray();

	        int ar[]=new int[26];

	        for(int i=0;i<ch.length;i++)
	        {
	            ar[ch[i]-65]++;
	        }
	        for(int i=0;i<ar.length;i++)
	        {
	            if(ar[i]==0)
	            {
	                System.out.println("Its not pangram");
	                flag=true;
	            }
	        }
	        
	        if(flag==false)
	        {
	            System.out.println("Its pangram");
	        }
	        
		}
		

	}


