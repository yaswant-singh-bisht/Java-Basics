package javaTopics;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;

		System.out.println("a && b = " + (a && b)); // logical AND
		System.out.println("a || b = " + (a || b)); // logical OR
		System.out.println("!a && b = " + !(a && b)); // logical NOT
		System.out.println("!a && b = " + (!a && b)); // logical NOT (value for a reversed first and then compared)
	}

}
