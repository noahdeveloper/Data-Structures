package Stack;

import java.util.EmptyStackException;

/* Explanation:
 * A stack is an abstract data type which allows for 
 * elements to be stored in a collection. Stacks are a 'last in, first out'
 * collection. This means that the last element added to the collection will
 * also be the first element out.
 */

/*
 * A stack stores at least two values, one being an array 
 * which stores the elements being stored in the stack
 * and the other value is the an integer value representing the 
 * top value of the stack.
 */
public class Stack {
	 private Object[] stack;
	 private int top;
	 
	 //Setting array size.
	 public Stack(int capacity) {
		 stack = new Object[capacity];
	 }
	 
	 //Adds an element to the top/back of the stack.
	 //O(1) if array needs no resizing.
	 //O(n) is array needs resizing.
	 public void push(Object obj) {
		 if(top == stack.length) {
			 Object[] newArray = new Object[2 * stack.length];
			 System.arraycopy(stack, 0, newArray, 0, stack.length);
			 stack = newArray;
		 }
		 
		 stack[top++] = obj;
	 }
	 
	 //Removes an element from the top/back of the stack.
	 //O(1)
	 public Object pop() {
		 if(isEmpty()) 
			 throw new EmptyStackException();
		 
		 Object obj = stack[--top];
		 stack[top] = null;
		 return obj;
	 }
	 
	 //Gets the element at the top/back of the stack.
	 //O(1)
	 public Object peek() {
		 if(isEmpty())
			 throw new EmptyStackException();
		 
		 return stack[top - 1];
	 }
	 
	 public int size() {
		 return top;
	 }
	 
	 public boolean isEmpty() {
		 return top == 0;
	 }
	 
	 public Object[] getStack() {
		 return stack;
	 }
	 
	 public int getTop() {
		 return top;
	 }
}
