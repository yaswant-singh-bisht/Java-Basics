package javaBasics;

class Calculation {

	public void addition(int a, int b) {
	int c = a+b;
	System.out.println("Addition of numbers is: "+c);	
	}
	public void subtraction(int a, int b) {
	int c = a-b;
	System.out.println("Subtraction of numbers is: "+c);	
	}
	
}

public class ExtendCalculation extends Calculation{

	public void multiplication(int a, int b) {
			int c = a*b;
			System.out.println("Multiplication of numbers is: "+c);	
			
	}
	
	public static void main(String[] args) {
		ExtendCalculation obj = new ExtendCalculation();
		int a = 20,b=10;
		obj.addition(a, b);
		obj.subtraction(a, b);
		obj.multiplication(a, b);
		
	}

}
