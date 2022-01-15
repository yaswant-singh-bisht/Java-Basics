package javaTopics;

public class StaticNestedClass {

	public static class NestedClass{
		public void display() {
			System.out.println("This is an example of static nested class");
		}
	}
	
	
	public static void main(String[] args) {

		StaticNestedClass.NestedClass nestedclass = new StaticNestedClass.NestedClass();
		nestedclass.display();
	}

}
