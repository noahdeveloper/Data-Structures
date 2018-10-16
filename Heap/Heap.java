package Heap;

/*
 * Noe Pineda 10/15/2018
 * Explanation: A heap is a tree-based data structure in which each node is either
 * smaller or larger than its parent node. The heap is backed by an array.
 */
public class Heap {
	private int[] heap;
	private int size;
	
	//O(1)
	//Sets size of heap
	public Heap(int capacity) {
		heap = new int[capacity];
	}
	
	//O(n)
	//Inserts value provided into the array/heap, fixes heap above current node
	//and increases size.
	public void insert(int value) {
		if (isFull()) {
			throw new IndexOutOfBoundsException("Heap is full");
		}
		
		heap[size] = value;
		
		fixHeapAbove(size);
		size++;
	}
	
	//O(1)
	//Returns first element in array/heap.
	public int peek() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		
		return heap[0];
	}
	
	//O(n)
	//Deletes element of array/heap at index provided.
	//Replace the element at the given index with the last
	//element in the array/heap, if new value at given index
	//greater than its parent then fix heap above, else fix
	//heap below. Decrease heap size and return deleted value.
	public int delete(int index) {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Heap is empty");
		}
		
		int parent = getParent(index);
		int deletedValue = heap[index];
		
		heap[index] = heap[size - 1];
		
		if(index == 0 || heap[index] < heap[parent]) {
			fixHeapBelow(index, size - 1);
		}
		else {
			fixHeapAbove(index);
		}
		
		size--;
		
		return deletedValue;
	}
	
	//O(n)
	//Iterate through array/heap, replace first element
	//in array/heap with the last and fix heap below.
	public void sort() {
		int lastHeapIndex = size - 1;
		for(int i = 0; i < lastHeapIndex; i++) {
			int tmp = heap[0];
			heap[0] = heap[lastHeapIndex - i];
			heap[lastHeapIndex - i] = tmp;
			
			fixHeapBelow(0, lastHeapIndex - i - 1);
		}
	}
	
	//O(n)
	//Insert new value at the end of the array/heap,
	//and swap places with its parent if the value 
	//being inserted is greater that its parent.
	private void fixHeapAbove(int index) {
		int newValue = heap[index];
		
		while(index > 0 && newValue > heap[getParent(index)]) {
			heap[index] = heap[getParent(index)];
			index = getParent(index);
		}
		
		heap[index] = newValue;
	}
	
	//O(n)
	//Get the left and right child of the given index and 
	//swap with current index if necessary.
	private void fixHeapBelow(int index, int lastHeapIndex) {
		int childToSwap;
		
		while(index <= lastHeapIndex) {
			int leftChild = getChild(index, true);
			int rightChild = getChild(index, false);
			
			if(leftChild <= lastHeapIndex) {
				if(rightChild > lastHeapIndex) {
					childToSwap = leftChild;
				}
				else {
					childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
				}
				
				if(heap[index] < heap[childToSwap]) {
					int tmp = heap[index];
					heap[index] = heap[childToSwap];
					heap[childToSwap] = tmp;
				}
				else {
					break;
				}
				
				index = childToSwap;
			}
			else {
				break;
			}
		}
	}
	
	//Iterate through array/heap and print each element
	public void printHeap() {
		for(int i = 0; i < size; i++) {
			System.out.print(heap[i]);
			System.out.print(", ");
		}
		System.out.println();
	}
	
	public boolean isFull() {
		return size == heap.length;
	}
	
	public int getParent(int index) {
		return (index - 1) / 2;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getChild(int index, boolean left) {
		return index * 2 + (left? 1 : 2);
	}
}
