package BinarySearchTree;

/* Noe Pineda 10/12/2018
 * Explanation: 
 * A binary search tree is a data structure which stores nodes,
 * each node has two children. In a binary search tree the left 
 * subtree of a node must contain values smaller than the current node. 
 * The right subtree of of a node must contain values larger that the
 * current node. The left and right subtrees must meet the same criterion. 
 * 
 * A tree must store at least its root node, from the root node all other 
 * nodes can be referenced.
 */
public class Tree {
	private TreeNode root;
	
	//Using root node as a starting point looks for place in the BST 
	//to insert the new node (no duplicates allowed).
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	//Using the root node as a starting point looks for the 
	//value provided.
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		
		return null;
	}
	
	public void delete(int value) {
		root = delete(root, value);
	}
	
	//Delete the value provided using the rule of the BST.
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot == null) {
			return subtreeRoot;
		}
		
		if(value < subtreeRoot.getData()) {
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
		}
		else if (value > subtreeRoot.getData()) {
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
		}
		else {
			//Cases 1 and 2: node to delete has 0 or 1 children
			if(subtreeRoot.getLeftChild() == null) {
				return subtreeRoot.getRightChild();
			}
			else if (subtreeRoot.getRightChild() == null) {
				return subtreeRoot.getLeftChild();
			}
			
			//Case 3: node to delete has 2 children
			
			//Replace the value in the sebtreeRoot node with the smallest value
			//from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightChild().min());
			
			//Delete the node that has the smallest value int the right subtree.
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
		}
		return subtreeRoot;
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		else {
			return root.min();
		}
	}
	
	public int max() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		else {
			return root.max();
		}
	}
	
	public void traverseInOrder() {
		if(root != null) {
			root.traverseInOrder();
		}
	}
}
