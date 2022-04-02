package javaBasicsPolymorphism;

class Parent {

	Parent(){ // Object created only for child but still called implicitely
		System.out.println("Parent constructor");
	}

	int a = 10;

	public void display() {
		System.out.println("Parent method...");
	}
}

class Child extends Parent{

	Child(){
		System.out.println("Child constructor");
	}

	int a = 20;

	public void display() {
		System.out.println("Child method...");

		System.out.println(super.a);
		super.display();
	}	
}

public class SuperClass {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.a);
		obj.display();
	}
}