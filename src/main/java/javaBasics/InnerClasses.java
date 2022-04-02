package javaBasics;

class OuterClass{
	
	private class InnerClass{
		public void print() {
			System.out.println("Example of inner class");
		} 
	}
	
	public void PrintInner() {
		InnerClass InnClass = new InnerClass();
		InnClass.print();
	}
	
}

public class InnerClasses {

	public static void main(String[] args) {
		OuterClass OutClass = new OuterClass();
		OutClass.PrintInner();
	}

}
