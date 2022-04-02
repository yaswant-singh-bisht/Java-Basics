package javaArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {

	public static void arrayList() {
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
	
	public static void main(String[] args) {
		//Calling Array List
		arrayList();

	}

}
