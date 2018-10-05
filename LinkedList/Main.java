package LInkedListGitHub;

public class Main {

	public static void main(String[] args) {
		//Linked list of Persons declared
		LinkedList<Person> list = new LinkedList<Person>();
		
		//Person objects being created
		Person johnDoe = new Person("John Doe", 35, 57_000.00);
		Person MaryJohnson = new Person("Mary Johnson", 18, 35_000.00);
		Person JuanMartinez = new Person("Juan Martinez", 46, 60_000.00);
		Person JasminePavon = new Person("Jasmine Pavon", 26, 47_000.00);
		Person NolanPeterson = new Person("Nolan Peterson", 75, 97_000.00);
		
		//Adding person objects front of list
		list.AddToFront(new LinkedListNode<Person>(johnDoe));
		list.AddToFront(new LinkedListNode<Person>(MaryJohnson));
		list.AddToFront(new LinkedListNode<Person>(JuanMartinez));
		list.AddToFront(new LinkedListNode<Person>(JasminePavon));
		list.AddToFront(new LinkedListNode<Person>(NolanPeterson));
		
		//Iterating through list
		for(int i = 0; i < list.GetSize(); i++) {
			System.out.print(list.getNodeAt(i).getValue().getName());
			System.out.print(" -> ");
		}
		
		System.out.println("");
		System.out.println("Removing first two elements from list:");
		
		//Removing current head from list
		list.removeFromFront();
		list.removeFromFront();
		
		//Iterating through list
		for(int i = 0; i < list.GetSize(); i++) {
			System.out.print(list.getNodeAt(i).getValue().getName());
			System.out.print(" -> ");
		}
	}
}
