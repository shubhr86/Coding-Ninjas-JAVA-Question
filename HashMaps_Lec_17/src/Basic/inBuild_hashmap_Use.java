package Basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class inBuild_hashmap_Use {

	public static void main(String[] args) {

	HashMap<String, Integer> map = new HashMap<>();
	
	// insert
	
	map.put("abc", 1);
	map.put("def",2);
	
	
	// size
	
	System.out.println("Size: "+map.size());
	
	// check Presence
	
	 if (map.containsKey("abc")) {
		 System.out.println("Has abc");
	 }
	// when not found
	 if (map.containsKey("abc1")) {
		 System.out.println("Has abc1");
	 }
	 
	 // get Value
	 int v=0;
	 if (map.containsKey("abc")) {
		 v= map.get("def");
	 }
	 System.out.println(v);
	 
	 
	 // remove
	 
	 int s = map.remove("abc");
	 System.out.println(s);
	 
	 // iterate
	 Set<String> keys = map.keySet();
	 for (String str: keys)
		 System.out.println(str);
	 
	 // iterate Values
	 
	 Collection<Integer> values=  map.values();
	 for (Integer ele: values)
		 System.out.println(ele);
	 
	}

}
