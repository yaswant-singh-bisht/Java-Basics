package javaTopics;

public class MethodLocalInnerClass {
	int num = 10;
	public void demo() {
		class InnerClass{
			public void display() {
				System.out.println("This is example of Method Local Inner Class");
				System.out.println("Instance variable value is "+num);
			}
		}
		InnerClass InnClass = new InnerClass();
		InnClass.display();
	}


	public static void main(String[] args) {
		MethodLocalInnerClass MethodInnClass = new MethodLocalInnerClass();
		MethodInnClass.demo();
	}

}
