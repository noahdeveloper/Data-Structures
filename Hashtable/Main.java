package HashTable;

public class Main {

	public static void main(String[] args) {
		HashTable hashtable = new HashTable(4);
		
		hashtable.put("Johnson", new Person("John Johnson", 24, 57_000));
		hashtable.put("Doe", new Person("John Doe", 24, 57_000));
		hashtable.put("Smith", new Person("Mary Smith", 24, 57_000));
		hashtable.put("Martinez", new Person("Joe Martinez", 24, 57_000));
		hashtable.put("Dolan", new Person("Matt Dolan", 24, 57_000));
		
		hashtable.remove("Doe");
		
		printHashtable(hashtable);
	}
	
	private static void printHashtable(HashTable hashtable) {
		for(int i = 0; i < hashtable.getHashtable().length; i++) {
			
			if(hashtable.getHashtable()[i] != null) {
				Person person = (Person)hashtable.getHashtable()[i].getValue();
				System.out.println(hashtable.getHashtable()[i].getKey() + 
						" -> "+ person.getName());
			}
		}
	}
}
