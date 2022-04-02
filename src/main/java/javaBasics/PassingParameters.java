package javaBasics;

public class PassingParameters {

	public static void swapFunction(int n1, int n2) {
		int n3 = n1;
		n1 = n2;
		n2 = n3;
		System.out.println("First number: "+n1+", second Number: "+n2);
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		System.out.println("First number: "+a+", second Number: "+b);
		swapFunction(a,b);
	}

}
