package javaBasics;

class test {}

public class MiscInstanceOfOperator extends test { 
	public static void  main(String[] args) { 
		String name = "Yash"; 
		boolean example1 = name  instanceof String; 
		System.out.println(example1);

		test a = new MiscInstanceOfOperator(); 
		boolean example2 = a instanceof  test; 
		System.out.println(example2); } 
}

