package javaBasicsObjectClass;

public class Constructor {
	int x;
	
	Constructor() {
		x= 10;
	}
	
	public static void main(String[] args) {
		Constructor t1 = new Constructor();
//		Constructor t2 = new Constructor();
		System.out.println(t1.x);//+", "+t2.x);
	}

}
