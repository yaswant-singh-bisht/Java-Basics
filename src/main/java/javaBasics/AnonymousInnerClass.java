package javaBasics;

abstract class AnonymousInnerClassExample{
	public abstract void display();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		AnonymousInnerClassExample AInnClass = new AnonymousInnerClassExample() {
			public void display() {
				System.out.println("Example of Anonymous Inner Class");
			} ;
		};
	AInnClass.display();	
	}

}
