package DoublyLinkedLIstGitHub;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList<Person> list = new DoublyLinkedList<Person>();
		
		Person johnDoe = new Person("John Doe", 35, 57_000.00);
		Person MaryJohnson = new Person("Mary Johnson", 18, 35_000.00);
		Person JuanMartinez = new Person("Juan Martinez", 46, 60_000.00);
		Person JasminePavon = new Person("Jasmine Pavon", 26, 47_000.00);
		Person NolanPeterson = new Person("Nolan Peterson", 75, 97_000.00); 
		
		list.addToFront(new LinkedListNode<Person>(johnDoe));
		list.addToFront(new LinkedListNode<Person>(MaryJohnson));
		list.addToFront(new LinkedListNode<Person>(JuanMartinez));
		list.addToEnd(new LinkedListNode<Person>(JasminePavon));
		list.addToEnd(new LinkedListNode<Person>(NolanPeterson));

		printList(list);
		
		list.removeFromEnd();
		list.removeFromFront();
		
		printList(list);
	}
	
	public static void printList(DoublyLinkedList<Person> list) {
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.getNodeAt(i).getValue().getName());
			System.out.print(" -> ");
		}
		System.out.println("");
	}

}
