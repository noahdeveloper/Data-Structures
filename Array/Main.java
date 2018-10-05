
public class Main {

	public static void main(String[] args) {
		//Array declaration example 1:--------------------
		//Declaring an array with 7 different containers of (primitive type) integers.
		int[] intArray1 = new int[7];
	
		//Setting the value for each index in the array
		intArray1[0] = 20;
		intArray1[1] = 35;
		intArray1[2] = -15;
		intArray1[3] = 7;
		intArray1[4] = 55;
		intArray1[5] = 1;
		intArray1[6] = -22;
		
		//Array declaration example 2:---------------------------
		//Declaring an array by declaring its size and values on the same line.
		int[] intArray2 = {10, 4, -9, 3, 1, 56};
		
		//Iterating through each index of the array (from example 1) and accessing the value of each index to print it out.
		for(int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}

	}

}
