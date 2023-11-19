package Implemenation_Basic;

public class trieUse {

	public static void main(String[] args) {
		Trie t= new Trie();
		t.add("this");
		t.add("news");
		t.add("ok");
		System.out.println(t.search("news"));
		System.out.println(t.countWords());
	}

}
