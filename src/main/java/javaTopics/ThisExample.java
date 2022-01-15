package javaTopics;

public class ThisExample {
	int num = 10;//instance variable
	
	ThisExample() {
		System.out.println("Example on keyword \"this\"");
	}

	ThisExample(int num){
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
		
		this.greet();
	}
	
	public static void main(String[] args) {
		ThisExample obj1 = new ThisExample();
		obj1.print();
		
		ThisExample obj2 = new ThisExample(30);
		obj2.print();
	}

}
