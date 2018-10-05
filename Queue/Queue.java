package Queue;

import java.util.NoSuchElementException;

/* Noe Pineda 10/4/2018
 * Explanation:
 * A queue is an abstract data type which allows for elements
 * to be stored in a collection. A queue is a 'first in first out'
 * data structure. 
 */

/*
 * A queue stores at least three values. One being an 
 * array which stores the elements being added to the queue,
 * another is an integer which keeps track of where in the array
 * the front of the queue is, and the last value is an integer 
 * which keeps track of where the back of the queue is in the array. 
 */
public class Queue {
	private Object[] queue;
	private int front;
	private int back;
	
	//Sets capacity
	public Queue(int capacity) {
		queue = new Object[capacity];
	}
	
	//Adds object to the back of the queue.
	//O(1) if array needs no resizing.
	//O(n) is array needs resizing.
	public void add(Object obj) {
		if(back == queue.length) {
			Object[] newQ = new Object[queue.length * 2];
			System.arraycopy(queue, 0, newQ, 0, queue.length);
			queue = newQ;
		}
		
		queue[back] = obj;
		back++;
	}
	
	//Removes object from the back of the queue.
	//O(1)
	public Object remove() {
		if(size() == 0)
			throw new NoSuchElementException();
		
		Object obj = queue[front];
		queue[front++] = null;
		
		if(size() == 0) {
			front = 0;
			back = 0;
		}
		
		return obj;
	}
	
	public Object peek() {
		if(size() == 0)
			throw new NoSuchElementException();
		
		return queue[front];
	}
	
	public int size() {
		return back - front;
	}
	
	public int getFront() {
		return front;
	}
	
	public int getBack() {
		return back;
	}
	
	public Object[] getQueue() {
		return queue;
	}
}
