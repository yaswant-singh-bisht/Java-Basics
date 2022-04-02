package javaBasics;

public class InstanceVariable {
	int i;
	static String sum = "Sum"; //static variable
	static String diff = "Difference"; //static variable 

	public void addition() {
		int a = 100;
		int b = 150;
		i=a+b;
		System.out.println(sum+" of i (a + b) is: "+i);
	}

	public void difference() {
		int x = 100;
		int y = 150;
		i=x-y;
		System.out.println(diff +" of i (x - y) is: "+i);
	}

	public static void main(String[] args) {
		InstanceVariable inst = new InstanceVariable();
		inst.addition();
		inst.difference();
	}

}
