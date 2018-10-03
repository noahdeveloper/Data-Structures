package DoublyLinkedLIstGitHub;

/*Noe Pineda 10/1/2018
 * 
 * Explanation: A doubly linked list is a data structure which allows for 
 * a list of elements to be stored in a linear format. Each element is stored 
 * in a node and each node has a minimum of three values. One node value is the 
 * value of the element being stored, the other value of the node is a reference
 * to the previous node and the last minimum value is a reference to the next node. 
 * 
 * Pro: Allows for list iteration from back to front.
 * Con: Takes up more memory since each node must reference both of its neighbors.
 */

public class DoublyLinkedList<T> {
	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size;
	
	//O(1)
	public void addToFront(LinkedListNode<T> node) {
		node.setNext(head);
		
		if(head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		
		head = node;
		size++;
	}
	
	//O(1)
	public void addToEnd(LinkedListNode<T> node) {
		node.setPrevious(tail);
		
		if(tail == null) {
			head = node;
		}
		else {
			tail.setNext(node);
		}
		
		tail = node;
		size++;
	}
	
	//O(n)
	public boolean addBefore(LinkedListNode<T> newNode, 
			LinkedListNode<T> searchNode) {
		
		if(head == null)
			return false;
		
		boolean existsInList = false;
		LinkedListNode<T> current = head;
		
		//Iterate through list starting at head till 'searchNode' is found
		while(current != null) {
			if(current.getValue().equals(searchNode.getValue())) {
				existsInList = true;
				break;
			}
			current = current.getNext();
		}
		
		//Exit function if 'searchNode' is not in list
		if(!existsInList)
			return false;
		
		//If searchNode is head
		if(searchNode.getValue().equals(head.getValue())) {
			LinkedListNode<T> oldHead = head;
			head = newNode;
			head.setNext(oldHead);
			oldHead.setPrevious(head);
			size++;
			return true;
		}
		else {
			LinkedListNode<T> current2 = head;
			LinkedListNode<T> addBefore = null;
			
			//Iterate through list till 'searchNode' is found.
			while(current2 != null) {
				if(current2.getValue().equals(searchNode)) {
					addBefore = current2;
					break;
				}
				
				current2 = current2.getNext();
			}
			
			LinkedListNode<T> previous = addBefore.getPrevious();
			previous.setNext(newNode);
			newNode.setPrevious(previous);
			newNode.setNext(addBefore);
			addBefore.setPrevious(newNode);
			size++;
			return true;
		}
	}
	
	//O(1)
	public LinkedListNode<T> removeFromFront() {
		if(isEmpty())
			return null;
		
		LinkedListNode<T> removeNode = head;
		
		if(head.getNext() == null) {
			tail = null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		removeNode.setNext(null);
		size--;
		return removeNode;
	}
	
	//O(1)
	public LinkedListNode<T> removeFromEnd(){
		if (isEmpty())
			return null;
		
		LinkedListNode<T> removeNode = tail;
		
		if(tail.getPrevious() == null) {
			head = null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		removeNode.setPrevious(null);
		size--;
		return removeNode;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	//O(n)
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
