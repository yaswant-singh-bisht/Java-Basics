package javaTopics;

public class BitwiseOperator {

	public static void main(String[] args) {
		int a = 60; // 60 in binary = 0011 1100
		int b = 13; // 13 in binary = 0000 1101

		System.out.println("a & b = " + (a & b)); // AND operator (exists in both) - 0000 1100 = 12
		System.out.println("a | b = " + (a | b)); // OR operator (exits in any one) - 0011 1101 = 61
		System.out.println("a ^ b = " + (a ^ b)); // XOR operator (exists in any one but not in both) - 0011 0001 = 49
		System.out.println("~a = " + (~a)); // flips bits - 1100 0011 = -16
		System.out.println("a << b = " + (a << b)); //left shift
		System.out.println("a >> b = " + (a >> b)); //right shift
		System.out.println("a >>> b = " + (a >>> b)); //zero fill right shift
	}

}
