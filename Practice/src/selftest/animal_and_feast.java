package selftest;

public class animal_and_feast {
	
	public static boolean animal(String name, String dish) {
		
		if (name.charAt(0) == dish.charAt(0) && name.charAt(name.length()-1) == dish.charAt(dish.length()-1)) {
			return true;
			
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		String name= "brown bear";
		String dish= "bear clow";
		System.out.println(animal(name, dish));

	}

}
