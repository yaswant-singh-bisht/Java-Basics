package javaCollection;

import java.util.Iterator;
import java.util.TreeSet;

/* Java TreeSet class implements the Set interface that uses a tree for storage. 
 * Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. 
 * The elements in TreeSet stored in ascending order. 
 * */

public class Set_TreeSet {

	public static void main(String[] args) {
		//Creating and adding elements  
		TreeSet<String> set=new TreeSet<String>();  
		
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  // Duplicate
		set.add("Ajay");  
		
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}

	}

}
