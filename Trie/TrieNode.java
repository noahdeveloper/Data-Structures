package Trie;

import java.util.*;

/*
 * The TrieNode class is used to wrap the node's values.
 * This gives access to to the current node value (char),
 * the nodes children (HashMap) and the isLeaf value (boolean).
 */
public class TrieNode {
	char c;
	HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	boolean isLeaf;
	
	public TrieNode() {}
	
	public TrieNode(char c) {
		this.c = c;
	}
}
