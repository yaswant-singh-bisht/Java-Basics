package javaExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Checked exceptions -> Compile time
 * Un-checked exceptions -> Run time
 * Exception handling is done using throws or try/catch
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

	public static void checkedException() {
		/* aka Compile Time Exception
		 * FileNotFoundException
		 * IOException
		 * ClassNotFoundException
		 * SQLException
		 */
		try {
			FileInputStream fis = new FileInputStream("C:/FileNotExists.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}

	public static void illegalArgument(int a) {
		if (a <=0 || a >=100) {
			throw new IllegalArgumentException("Input number is not allowed...");
		} else {
			System.out.println("Input value is - " + a);
		}
	}

	public static void uncheckedException() {
		/* aka Runtime Exception
		 * ArithmeticException
		 * NullPointerException
		 * NumberFormatException
		 * ArrayIndexOutOfBoundsException
		 * IllegalArgumentException
		 */
		try {
			int num = 1/0;
			System.out.println(num);
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
			System.out.println(num);
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

		illegalArgument(101);

	}

	public static void main(String[] args) {

		checkedException();
		uncheckedException();

	}

}
