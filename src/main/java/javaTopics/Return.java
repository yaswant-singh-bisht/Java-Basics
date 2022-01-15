package javaTopics;

public class Return {

	public static int myAge() {
		int age = 25;
		return age;
	}

	public static void main(String[] args) {
		int a = myAge();
		System.out.println("My age is "+a+" years.");
	}

}
