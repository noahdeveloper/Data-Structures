package HashTable;

/*
 * Noe Pineda 10/9/2018
 * 
 * Explanation:
 * A hash-table is a data structure which allows for key-value pair
 * storing. An array is used to hold the elements. The array index 
 * acts as a key since they must be unique and the array node is used
 * to store the element value.
 */

//This hash-table class uses an array of Node objects to enable generic usage.
public class HashTable {
	private Node[] hashtable;
	
	public HashTable(int capacity) {
		hashtable = new Node[capacity];
	}
	
	/*
	 * O(n)
	 * The key value of type String is hashed into an integer
	 * which is then used to traverse the arrays' indexes 
	 * in search of of the next available (empty) index.
	 */
	public void put(String key, Object value) {
		int hashedKey = hashKey(key);
		
		if(occupied(hashedKey)) {
			int stopIndex = hashedKey;
			
			if(hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			}
			else {
				hashedKey++;
			}
			
			while(occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
		}
		
		if(occupied(hashedKey)) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		}
		else {
			hashtable[hashedKey] = new Node(key, value);
		}
	}
	/*
	 * O(n)
	 * Calls the findKey function and if not -1
	 * then return the array element at that key.
	 */
	public Node get(String key) {
		int hashedKey = findKey(key);
		
		if(hashedKey == -1) {
			return null;
		}
		
		return hashtable[hashedKey];
	}
	
	/*
	 * O(n)
	 * Hashes key and iterates through array until that same 
	 * key is found in the array. If key is not found then returns -1.
	 */
	private int findKey(String key) {
		int hashedKey = hashKey(key);
		
		if(hashtable[hashedKey] != null &&
				hashtable[hashedKey].getKey().equals(key)) {
			return hashedKey;
		}
		
		int stopIndex = hashedKey;
		
		if(hashedKey == hashtable.length - 1) {
			hashedKey = 0;
		}
		else {
			hashedKey++;
		}
		
		while(hashedKey != stopIndex &&
				hashtable[hashedKey] != null &&
				!hashtable[hashedKey].getKey().equals(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}
		
		if(hashtable[hashedKey] != null &&
				hashtable[hashedKey].getKey().equals(key)) {
			return hashedKey;
		}
		else {
			return -1;
		}
	}
	
	/*
	 * O(n)
	 * Hashes key if key is not -1, then
	 * store current value of the current key
	 * in a temp variable. Null out the value
	 * at the current key location and copy all
	 * the non-null values to a new array. Return 
	 * the temp variable.
	 */
	public Node remove(String key) {
		int hashedKey = findKey(key);
		if(hashedKey == -1) {
			return null;
		}
		
		Node node = hashtable[hashedKey];
		hashtable[hashedKey] = null;
		
		Node[] oldHashtable = hashtable;
		hashtable = new Node[oldHashtable.length];
		for(int i = 0; i < oldHashtable.length; i++) {
			if(oldHashtable[i] != null) {
				put(oldHashtable[i].getKey(), oldHashtable[i].getValue());
			}
		}
		
		return node;
	}
	
	//The mod operator between the two values ensures
	//the key will always be within the bounds of the array.
	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}
	
	//Checks if that array's index is empty
	public boolean occupied(int index) {
		if(hashtable[index] == null)
			return false;
		else
			return true;
	}
	
	public Node[] getHashtable() {
		return hashtable;
	}
}
