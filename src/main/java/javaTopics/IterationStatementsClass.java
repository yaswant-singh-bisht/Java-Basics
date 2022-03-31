package javaTopics;

public class IterationStatementsClass {

	public static void main(String[] args) {
		// While
		int i = 0;
		while (i < 5) {
			System.out.println("While i < 5 - " + i);
			i++;
		}
		
		// Do while
		do 
		{
			System.out.println("Do while i < 10 - " + i);
			i++;
		} 
		while (i < 10);
		
		// For
		for (int j=0; j< 5;j++) {
			System.out.println("For j < 5 - " + j);
		}
		
		// Enhanced for loop
		int[] num = {1,2,3,4,5};
		for (int count : num){
			System.out.println("For each value in num - " + count);
		}

	}

}
