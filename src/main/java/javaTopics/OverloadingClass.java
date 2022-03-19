package javaTopics;

//Compile-time Polymorphism
public class OverloadingClass {
	//Constructor overloading
	OverloadingClass() {
		System.out.println("Constructor without parameter");
	}
	
	OverloadingClass(int a) {
		System.out.println("Constructor with parameter... "+ a);
	}
	
	//Method overloading
	public static void display() {
		System.out.println("Method without parameter");
	};

	public static void display(String a) {
		System.out.println("Method with parameter..." + a);
	};
	
	public static void main(String[] args) {
		//Constructor overloading
		OverloadingClass obj1 = new OverloadingClass(); 
		OverloadingClass obj2 = new OverloadingClass(10);
		
		//Method overloading
		obj1.display();
		obj1.display("parameter");
	
		//Operator overloading
		int b = 5;
		int c = 6;
		System.out.println("b + c = " + b + c);
		System.out.println("b + c = " + (b + c));
		
	}

}
