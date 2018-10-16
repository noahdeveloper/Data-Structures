package Trie;

public class Main {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insert("dog");
		trie.insert("dig");
		trie.insert("cat");
		
		boolean exists = trie.startsWith("cat");
		
		System.out.println(exists);
	}

}
