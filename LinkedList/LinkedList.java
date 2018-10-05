package LInkedListGitHub;

/* Noe Pineda 10/1/2018
 *
 * Explanation: 
 * Linked lists are a data structure that are similar to arrays in the sense that 
 * they too store elements in a linear format. Linked lists differentiate from arrays 
 * in the way they store their elements. In linked lists elements are stored in nodes.
 * Each node stores two values one being the value of the element being stored and 
 * the other value being a reference to the next node in the list.
 * 


//This linked list class will use generics to allow for the class 
//to be used for any object type
public class LinkedList<T>{
	
	//Only need a reference to the first element in the list (named head).
	private LinkedListNode<T> head;
	
	//Storing the size of list is fundamental for certain operations
	//like getSize() and iteration. 
	private int size;
	
	//Adds node to front of the list
	public void AddToFront(LinkedListNode<T> node) {
		LinkedListNode<T> oldHead = head;
		head = node;
		head.setNext(oldHead);
		size++;
	}
	
	//Removes node from front of the list
	public LinkedListNode<T> removeFromFront(){
		if(isEmpty()) {
			return null;
		}
		
		LinkedListNode<T> removeNode = head;
		head = head.getNext();
		size--;
		removeNode.setNext(null);
		return removeNode;
	}
	
	public int GetSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	//Gets the node at a specified location in the list
	//Useful for iteration
	//Time complexity: O(n)
	public LinkedListNode<T> getNodeAt(int i){
		
		LinkedListNode<T> currentNode = head;
		
		int currentIndex = 0;
		
		while (currentIndex < i) {
			currentNode = currentNode.getNext();
			currentIndex++;
		}
		
		return currentNode;
	}
}
