package javaTopics;

public class ConstructorWithParameter {
	int x;
	ConstructorWithParameter(int i) {
		x = i; 
	}
	
	public static void main(String[] args) {
		ConstructorWithParameter t1 = new ConstructorWithParameter(10);
		ConstructorWithParameter t2 = new ConstructorWithParameter(20);
		System.out.println(t1.x+", "+t2.x);
	}

}
