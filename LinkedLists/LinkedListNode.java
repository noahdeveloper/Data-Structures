package LInkedListGitHub;

//A linked list node requires at least two values.
//One being the value of the element being stored 
//and the other value being a reference to the next
//node in the list.
public class LinkedListNode<T> {
	//Stores the value for the current element
	private T value;
	
	//Stores a reference to the next element in the list.
	private LinkedListNode<T> next;
	
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
}
