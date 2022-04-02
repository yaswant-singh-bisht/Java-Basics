package javaCollection;

import java.util.Iterator;
import java.util.Vector;

/* Vector uses a dynamic array to store the data elements. 
 * It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework. */

public class List_VectorClass {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		v.add("Yash");
		v.add("Rahul");
		v.add("Suraj");
		v.add("Rakesh");

		Iterator<String> itr = v.iterator();

		while(itr.hasNext()) {
			System.out.println("Names are - " + itr.next());
		}

	}

}
