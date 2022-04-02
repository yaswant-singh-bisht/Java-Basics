package javaAbstraction;

abstract class AbstractClassA {
	// must have at least one abstract method
	abstract void display();
}

abstract class AbstractClassB extends AbstractClassA {
	// Can have both abstract and non-abstract method
	void display() {
		System.out.println("Definition of display method...");
	}
	
	abstract void show();
}

class AbstractClassC extends AbstractClassB {
	void show() {
		System.out.println("Definition of show method...");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//AbstractClassA obj = new AbstractClassA(); //object cannot be created for abstract class
		AbstractClassC obj = new AbstractClassC();
		obj.display();
		obj.show();
	}

}
