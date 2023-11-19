package Genrics;



public class Pairuse {

	public static void main(String[] args) {
		Pair <String,String> p= new Pair <String, String>("ab","cd");
		
		Pair <Integer,String>p1= new Pair<Integer,String>(1,"nc");
		Pair <Character,Character> p2= new Pair<>('a','b');
		
		// Pair in a Pair
		int a =8;
		int b=7;
		int c=15;
		Pair<Integer,Integer> Internalpair= new Pair<>(a,b);
		
		Pair<Pair<Integer,Integer>, Integer> p3= new Pair<>(Internalpair,c);
        
		System.out.println(p3.getSecond());
		
		System.out.println(p3.getFirst().getFirst());
		System.out.println(p3.getFirst().getSecond());
	}

}
