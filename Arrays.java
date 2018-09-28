
public class Arrays {

	/*
	 * Explanation:
	 * Arrays are a data structure which acts as a container of objects. Arrays have a fixed size which must be set 
	 * when the array is created. Each object in the array must be of the same type (true for Java). Each object is 
	 * accessed through its index.
	 */
	 
	 
	public static void main(String[] args) {
		
		//Array decleration example 1:--------------------
		//Declaring an array with 7 different containers of (primative type) integers.
		int[] intArray1 = new int[7];
	
		//Setting the value for each index in the array
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		//Array decleration example 2:---------------------------
		//Declaring an array by declaring its size and values on the same line.
		int[] intArray2 = {10, 4, -9. 3, 1, 56};
		
		//Iterating through each index of the array (from example 1) and accessing the value of each index to print it out.
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}