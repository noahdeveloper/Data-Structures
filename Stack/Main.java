package Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		stack.push(new Person("John Doe", 45, 89_000));
		stack.push(new Person("Jan Smith", 36, 32_000));
		stack.push(new Person("Mary Smith", 39, 54_000));
		stack.push(new Person("James Slim", 68, 100_000));
		
		printStack(stack);
		
		stack.pop();
		stack.pop();
		
		printStack(stack);
	}
	
	public static void printStack(Stack stack) {
		for(int i = stack.getTop() - 1; i >= 0; i--) {
			Person person = (Person)stack.getStack()[i];
			System.out.print(person.getName() + " -> ");
		}
		System.out.println("");
	}

}
