package Heap;

public class Main {

	public static void main(String[] args) {
		Heap heap = new Heap(10);
		
		heap.insert(20);
		heap.insert(15);
		heap.insert(17);
		heap.insert(11);
		heap.insert(13);
		
		//heap.delete(0);
		
		heap.sort();
		
		heap.printHeap();
		
		//System.out.println(heap.peek());
		
		//.delete(0);
		//heap.printHeap();
	
		//System.out.println(heap.peek());
	}

}
