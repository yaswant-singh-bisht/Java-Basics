package javaBasicsInheritance;
// Single inheritance - Parent to Child // ClassA inherited by ClassB
// Multi level inheritance - Parent to Child to Grand Child // ClassA inherited by ClassB inherited by ClassC
// Hierarchical inheritance - Parent to Child 1 and Child 2 // ClassA inherited by ClassB and ClassC

class InheritanceParent {
// Parent or Base class
	int a = 10;
	int b = 20;
	
	public void displayParent() {
		System.out.println("Parent method...");
	}
}

class InheritanceChild extends InheritanceParent{
// Child or Derived class
	int a = 15;
	int c = 25;
	
	public void displayChild() {
		System.out.println("Child method...");
	}
}

public class InheritanceMultiLevel extends InheritanceChild{
// Grand child class
	
	public static void main(String[] args) {
		
		InheritanceChild obj1 = new InheritanceChild();
		System.out.println(obj1.a); //This will print value from immediate parent since both parents have same variable
		
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		
		obj1.displayParent();
		obj1.displayChild();
	}
}
