package javaTopics;
/*
 * Checked exceptions -> Compile time
 * Un-checked exceptions -> Run time
 * 	Throwable class
 * 		ArithmeticException
 * 		NumberFormatException
 * 		ArrayIndexOutOfBoundsException
 * 		NullPointerException
 * Errors 
 */

/* 
 * Try
 * Catch
 * Finally
 * Throw
 * Throws
 */


public class ExceptionHandlingClass {

	public static void main(String[] args) {

		try {
			int num = 1/0;
		}
		catch (ArithmeticException e){
			e.printStackTrace();
		}
		finally {
			System.out.println("finally - This statement will always be executed...");
		}
		
		try {
			String st = null;
			System.out.println(st.length());
		}
		catch (NullPointerException e){
			e.printStackTrace();
		}
		
		try {
			String st = "hello";
			int num = Integer.parseInt(st);
		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}
		
		try {
			String[] st = {"Hello", "Hi"};
			st[2] = "test";
		}
		catch (ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}


	}

}
