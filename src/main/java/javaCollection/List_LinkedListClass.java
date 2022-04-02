package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

/* The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types. 
 * The ArrayList class maintains the insertion order and is non-synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed. 
 * */

public class List_LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Yash");
		list.add("Rahul");
		list.add("Amit");
		list.add("Niraj");

		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Name is - " + itr.next());
		}

	}

}
