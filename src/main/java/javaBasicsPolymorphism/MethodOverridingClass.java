package javaBasicsPolymorphism;

class ParentOverridingClass{
	public void display(){
		System.out.println("Parent display method...");
	}
}

class ChildOverridingClass extends ParentOverridingClass{
	//Final and Static cannot be overridden
	public void display(){
		//super.display(); // If we want to execute parent method also
		System.out.println("Child display method...");
	}
}

public class MethodOverridingClass {
	public static void main(String[] args) {
		ChildOverridingClass obj = new ChildOverridingClass();
		obj.display(); //System will execute child method
	}
}
