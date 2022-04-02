package javaCollection;
/* The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types. 
 * The ArrayList class maintains the insertion order and is non-synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed. 
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class List_ArrayListClass {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Yash");
		arrList.add("Yash"); //Array list allows duplicate values
		arrList.add("Amit");
		arrList.add("Rawat");
		System.out.println("\narrList values - " + arrList);
		System.out.println("Element at index 1 - "+arrList.get(1));
		arrList.set(1, "Bisht");
		System.out.println("Element at index 1 - "+arrList.get(1));

		//Iterating array list using Iterator
		Iterator<String> itr = arrList.iterator();
		while (itr.hasNext()){
			System.out.println("Iterator element - "+ itr.next());
		}

		//Sorting
		Collections.sort(arrList);

		//Iterating ArrayList using For-each loop
		for(String names:arrList) {
			System.out.println("For each name - "+names);
		}
	}

}
