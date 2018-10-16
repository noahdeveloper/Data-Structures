package Trie;

import java.util.HashMap;

/*
 * Noe Pineda 10/16/2018
 * Explanation: A trie is a tree like data structure which 
 * stores related nodes in a children-parent relationship.
 */
public class Trie {
	private TrieNode root;
	
	public Trie() {
		root = new TrieNode();
	}
	
	//O(n)
	//Gets or puts new node depending on if the char 
	//of the word exists in the current node's children.
	public void insert(String word) {
		HashMap<Character, TrieNode> children = root.children;
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			TrieNode t;
			
			if(children.containsKey(c)) {
				t = children.get(c);
			}
			else {
				t = new TrieNode(c);
				children.put(c, t);
			}
			
			children = t.children;
			
			if(i == word.length() - 1)
				t.isLeaf = true;
		}
	}
	
	//O(n)
	public boolean search(String word) {
		TrieNode t = searchNode(word);
		
		if(t != null && t.isLeaf)
			return true;
		else 
			return false;
	}
	
	//O(n)
	public boolean startsWith(String prefix) {
		TrieNode t = searchNode(prefix);
		
		if(t == null)
			return false;
		else 
			return true;
	}
	
	//O(n)
	//Starting from the root node search each nodes children
	//until the char at each node is not found, then return false.
	public TrieNode searchNode(String str) {
		HashMap<Character, TrieNode> children = root.children;
		TrieNode t = null;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(children.containsKey(c)) {
				t = children.get(c);
				children = t.children;
			}
			else {
				return null;
			}
		}
		
		return t;
	}
}
