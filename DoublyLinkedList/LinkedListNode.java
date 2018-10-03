package DoublyLinkedLIstGitHub;

/*
 * A node for a doubly linked list holds three values.
 * The node hold a reference for the node before, a reference
 * to the next node and the value of the element being stored.
 */

public class LinkedListNode<T> {
	private T value;
	private LinkedListNode<T> next;
	private LinkedListNode<T> previous;
	
	public LinkedListNode(T value) {
		this.value = value;
	}
	
	public void setNext(LinkedListNode<T> next) {
		this.next = next;
	}
	
	public LinkedListNode<T> getNext() {
		return next;
	}
	
	public T getValue(){
		return value;
	}
	
	public void setPrevious(LinkedListNode<T> previous) {
		this.previous = previous;
	}
	
	public LinkedListNode<T> getPrevious() {
		return previous;
	}
}
