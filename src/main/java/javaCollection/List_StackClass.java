package javaCollection;

import java.util.Iterator;
import java.util.Stack;

/* The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), 
 * boolean peek(), boolean push(object o), which defines its properties. 
 * */

public class List_StackClass {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  

		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");

		stack.pop(); //delete last entered record (last-in-first-out)

		Iterator<String> itr = stack.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		} 
	}

}
