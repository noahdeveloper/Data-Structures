package Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(4);
		
		queue.add(new Person("John Doe", 45, 89_000));
		queue.add(new Person("Jan Smith", 36, 32_000));
		queue.add(new Person("Mary Smith", 39, 54_000));
		queue.add(new Person("James Slim", 68, 100_000));
		
		printQueue(queue);
		
		queue.remove();
		queue.remove();
		
		printQueue(queue);
	}
	
	public static void printQueue(Queue queue) {
		for(int i = queue.getFront(); i < queue.getBack(); i++) {
			Person person = (Person)queue.getQueue()[i];
			System.out.print(person.getName() + " -> ");
		}
		System.out.println("");
	}

}
