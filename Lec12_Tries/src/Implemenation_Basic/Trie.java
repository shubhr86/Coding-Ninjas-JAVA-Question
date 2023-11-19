package Implemenation_Basic;

 class TrieNode {
	char data;
	boolean isTerminating; // word end char should be bold.
	TrieNode children[]; // all child info means 26 Alphabat char
	
	public TrieNode(char data) {
		this.data= data;
		isTerminating= false;
		children=  new TrieNode[26];
	}
	

}
	public class Trie{
	
		private TrieNode root;
		private int count;
		public Trie() {
			// trie is null for now
			root= new TrieNode('\0');
		}
		// Add signature
		
		private void add(TrieNode root, String word) {
			
			if (word.length() ==0) {
				root.isTerminating= true;
				return;
			}
			
			int childIndex= word.charAt(0) -'a';
			TrieNode child = root.children[childIndex];
			if (child ==null) {
				child= new TrieNode(word.charAt(0));
				root.children[childIndex] = child;
			}
			// Recursive call
			add(child, word.substring(1));
		}
		
		public void add(String word) {
			
			add(root,word);
			this.count++;
		}
		
		// search
		
		public boolean search(String word) {
			return search(root,word);
		}
		private boolean search(TrieNode root, String word) {
			if (word.length() ==0) {
				// terminating point return
				return root.isTerminating;
				
			}
			int childIndex= word.charAt(0) -'a';
			TrieNode child = root.children[childIndex];
			if (child ==null) {
				// first alphabat is not found
				return false;
			
			}
			return search(child, word.substring(1));
		}
		
		// remove
		
		public void remove(String word) {
			remove(root,word);
			this.count--;
		}
		private void remove(TrieNode root, String word) {
			if (word.length()==0) {
				root.isTerminating= false;
				return;
			}
			int childIndex= word.charAt(0) -'a';
			TrieNode child = root.children[childIndex];
			if (child ==null) {
				return;
			}
			remove(child, word.substring(1));
			// permanent delete of the child
			if (!child.isTerminating) {
				int numChild =0;
				for (int i=0; i<26; i++) {
					if (child.children[i]!=null) {
						numChild++;
					}
				}
				if (numChild ==0 ) {
					// we can delete child
					 root.children[childIndex] =null;
					 child=null;
				}
			}
			
		}
		public int countWords() {
			
			return count;
		}
		
		
}
