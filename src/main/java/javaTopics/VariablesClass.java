package javaTopics;

public class VariablesClass {

	int a = 10; //Instance variable
	static int b = 20; //Static variable
	public static void main(String[] args) {
		int c = 30;
		
		VariablesClass obj = new VariablesClass();
		System.out.println(obj.a);
		
		System.out.println(b);
		//or
		System.out.println(VariablesClass.b); //Classname . static variable name
		
		System.out.println(c);
		

	}

}
