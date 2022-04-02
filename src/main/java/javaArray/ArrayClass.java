package javaArray;

public class ArrayClass {

	public static void printArray(int[] array) {
		for(int i=0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length -1) {
				System.out.print(", ");
			}
		}
	}

	//array as return result
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		int len = result.length;
		for(int i =0, j = len -1; i < len; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void multiDimensionalArray() {
		// Multi-dimensional array
		int[][] twoD = new int[4][5];
		int i, j, k = 0;

		//Filling values in array
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 5; j++) {
				twoD[i][j] = k;
				k++;
			}
		}
		//Printing array values
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 5; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();

		}

		// Irregular multi-dimensional array
		System.out.println();
		k = 0;
		int[][] twoD2 = new int[4][];
		twoD2[0] = new int[1];
		twoD2[1] = new int[2];
		twoD2[2] = new int[3];
		twoD2[3] = new int[4];

		//Filling values in array
		for(i = 0; i < 4; i++) {
			for(j = 0; j < i + 1; j++) {
				twoD2[i][j] = k;
				k++;
			}
		}
		//Printing array values
		for(i = 0; i < 4; i++) {
			for(j = 0; j < i + 1; j++) {
				System.out.print(twoD2[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static void main(String[] args) {

		char[] myArray; //declaration
		myArray = new char[5]; //allocate memory

		//Initialization
		myArray[0] = 'H';
		myArray[1] = 'e';
		myArray[2] = 'l';
		myArray[3] = 'l';
		myArray[4] = 'o';

		System.out.println(myArray);

		//print array elements 
		System.out.println("");
		double myArrayList [] = {11.1,14.4,54.14,25.54,14.15,54,14}; 
		for(int i = 0; i < myArrayList.length; i++){
			//System.out.print(myArrayList[i]+", ");
			System.out.print(myArrayList[i]);
			if(i < myArrayList.length -1) {
				System.out.print(", ");
			}
		}

		// sum all the array element
		System.out.println("");
		double total = 0;
		for(int i = 0; i < myArrayList.length; i++) {
			total += myArrayList[i];
		}
		System.out.println("\nTotal: "+total);

		//Find max of the array elements
		double max = myArrayList[0];
		for(int i = 1; i < myArrayList.length; i++) {
			if(myArrayList[i] > max) {
				max = myArrayList[i];
			}
		}
		System.out.println("\nMax value: "+max);

		//enhanced for loop (For each loop) to print all the elements of the array
		for(double element: myArrayList) {
			System.out.println(element);
		}

		//array a method argument
		printArray(new int[] {3,1,5,2,4});

		//print array element in reverse order
		System.out.println();
		printArray(reverse(new int[] {1,2,3,4,5}));

		//Multi-dimensional array
		System.out.println("\n");
		multiDimensionalArray();
		

	}


}
