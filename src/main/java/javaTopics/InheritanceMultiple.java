package javaTopics;

//Multiple inheritance
//Hybrid inheritance

interface InheritanceMultipleA{
	void display();
	
	default void msg() {
		System.out.println("msg method from InheritanceMultipleA...");
	}
}

interface InheritanceMultipleB{
	void show();
}

class InheritanceMultipleAB implements InheritanceMultipleA, InheritanceMultipleB {
	public void display() {
		System.out.println("Definition of display method from Interface A...");
	}
	
	public void show() {
		System.out.println("Definition of display method from Interface B...");
	}
}


public class InheritanceMultiple {

	public static void main(String[] args) {
		InheritanceMultipleAB obj = new InheritanceMultipleAB();
		obj.display();
		obj.show();
		obj.msg();
	}

}