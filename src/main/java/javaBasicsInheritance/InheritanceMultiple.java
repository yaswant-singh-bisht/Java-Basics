package javaBasicsInheritance;

//Multiple inheritance // ClassA and ClassB inherited by ClassC
//Hybrid inheritance // ClassA inherited by ClassB and ClassC; ClassB and ClassC inherited by ClassD

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
