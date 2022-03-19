package javaTopics;

public class StaticVariableMethodBlock {

	static int a = 10;
	
	static void display() {
		System.out.println("Static method call...");
	}
	
	//Static block
	static {
		System.out.println("Static block call...");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		display();
		
		StaticBlockExample obj = new StaticBlockExample(); //If there is any reference to the class then static block will be executed
		//Or
		//System.out.println(StaticBlockExample.b); //If there is any reference to the class then static block will be executed
		
	}

}
