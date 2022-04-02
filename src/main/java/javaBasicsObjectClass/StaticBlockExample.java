package javaBasicsObjectClass;

public class StaticBlockExample {
	
	static int b = 10;
	
	// Class will be referred in StaticVariableMethodBlock class
	static {
		System.out.println("StaticBlockExample - Static block call...");
	}
}

