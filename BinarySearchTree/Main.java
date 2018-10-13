package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		Tree intTree = new Tree();
		intTree.insert(17);
		intTree.insert(13);
		intTree.insert(20);
		intTree.insert(11);
		intTree.insert(15);
		
		intTree.delete(13);
		intTree.traverseInOrder();
	}

}
