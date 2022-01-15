package javaTopics;

public class AssignmentOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		System.out.println("c = a + b = " + (c = a + b)); //
		c = a + b;
		System.out.println("c -= a = " + (c -= a)); //c=c-a
		System.out.println("c += a = " + (c += a)); //c=c+a
		System.out.println("c *= a = " + (c *= a)); //c=c*a
		System.out.println("c /= a = " + (c /= a)); //c=c/a
		c = 15;		
		System.out.println("c %= a = " + (c %= a));
		
		System.out.println(c);
		System.out.println("c <<= 2 = " + (c <<= 2));
		System.out.println("c >>= 2 = " + (c >>= 2));
		System.out.println("c &= 2 = " + (c &= 2));
		System.out.println("c ^= 2 = " + (c ^= a));
		System.out.println("c != 2 = " + (c != a));
		
	}

}
