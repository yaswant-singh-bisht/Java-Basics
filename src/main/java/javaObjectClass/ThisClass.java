package javaObjectClass;

public class ThisClass {
	int num = 10;//instance variable
	
	ThisClass() {
		System.out.println("Example on keyword \"this\"");
	}

	ThisClass(int num){
		//invoking the default constructor
		this();
		//assigning local variable num to instance varialble num 
		this.num = num;
	} 
	
	public static void greet() {
		System.out.println("Welcome");
	}
	
	public void print() {
		int num = 25;//local variable
		
		System.out.println("Local variable num = "+num);
		System.out.println("Instance variable num = "+this.num);
		
		this.greet(); // Same as "ThisExample.greet();"
	}
	
	public static void main(String[] args) {
		ThisClass obj1 = new ThisClass();
		obj1.print();
		
		ThisClass obj2 = new ThisClass(30);
		obj2.print();
	}

}
